package order.service;

import order.model.Orders;

public class OrderService {
    private Orders orders;

    public OrderService(Orders orders) {
        this.orders = orders;
    }

    public int deliverPrice() {
        int totalOrderPrice = orders.totalOrderPrice();
        if (totalOrderPrice < 50000) {
            return 2000;
        }
        if (totalOrderPrice < 100000) {
            return 1000;
        }
        return 0;
    }

    public int totalPrice() {
        return deliverPrice() + orders.totalOrderPrice();
    }
}
