package order.model;

import order.dto.OrderMenuRes;
import order.enumerate.MenuGroup;

import java.util.ArrayList;
import java.util.List;

public class Orders {
    private List<Order> orders;

    public Orders() {
        orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    /**
     * 메뉴 그룹 체크 메소드
     *
     * @return true-음료만으로 주문하지 않을 경우
     */
    public boolean checkMenuGroup() {
        for (Order order : orders) {
            if (!MenuGroup.isBeverage(order.getMenu())) {
                return true;
            }
        }
        return false;
    }

    public int totalOrderPrice() {
        int sum = 0;
        for (Order order : orders) {
            sum += (order.getQuantity() * order.getMenu().getPrice());
        }
        return sum;
    }

    public int calculateServiceQuantity() {
        int count = 0;
        for (Order order : orders) {
            if (MenuGroup.isMain(order.getMenu())) {
                count += order.getQuantity();
            }
        }
        return count;
    }

    public int deliverPrice() {
        int totalOrderPrice = totalOrderPrice();
        if (totalOrderPrice < 50000) {
            return 2000;
        }
        if (totalOrderPrice < 100000) {
            return 1000;
        }
        return 0;
    }

    public int totalPrice() {
        return deliverPrice() + totalOrderPrice();
    }

    public List<OrderMenuRes> getOrderResult() {
        List<OrderMenuRes> orderResults = new ArrayList<>();

        orders.forEach(
                order -> orderResults.add(new OrderMenuRes(order.getMenu().getName(), order.getQuantity(), order.getMenu().getPrice() * order.getQuantity()))
        );
        return orderResults;
    }
}
