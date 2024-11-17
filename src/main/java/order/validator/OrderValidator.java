package order.validator;

import order.message.ErrorMessage;
import order.model.Order;
import order.model.Orders;

public class OrderValidator {
    private Orders orders;

    public OrderValidator(Orders orders) {
        this.orders = orders;
    }

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
