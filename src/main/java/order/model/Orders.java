package order.model;

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
}
