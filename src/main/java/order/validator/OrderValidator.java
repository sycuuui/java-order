package order.validator;

import order.message.ErrorMessage;
import order.model.Order;
import order.model.Orders;

public class OrderValidator {
    private Orders orders;

    public OrderValidator(Orders orders) {
        this.orders = orders;
    }

    /*
    주문 할 수 있는 조건에 따른 검증
     */
    public void orderValidator() {
        checkMenuGroup();
        checkMinOrderPrice();
    }

    private void checkMenuGroup() {
        if (!orders.checkMenuGroup()) {
            throw new IllegalArgumentException(ErrorMessage.ONLY_BEVERAGE.getMessage());
        }
    }

    private void checkMinOrderPrice() {
        if (orders.totalOrderPrice() < 30000) {
            throw new IllegalArgumentException(ErrorMessage.MIN_ORDER_PRICE.getMessage());
        }
    }
}
