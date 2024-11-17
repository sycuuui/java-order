package order.controller;

import order.model.Orders;
import order.repository.OrderRepository;
import order.view.Input;

public class OrderController {
    private Input input;
    private Orders orders;

    public OrderController() {
        input = new Input();
        orders = new Orders();
    }

    public void order() {
        orderMenuProcess();
    }

    private void orderMenuProcess() {
        String[] datas = input.requestOrder();

        OrderRepository orderRepository = new OrderRepository(orders);
        orderRepository.saveOrder(datas);
    }
}
