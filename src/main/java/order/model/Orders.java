package order.model;

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
}
