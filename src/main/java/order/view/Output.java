package order.view;

import order.dto.OrderMenuRes;
import order.message.OutputMessage;
import order.model.Orders;

import java.util.List;

public class Output {
    private Orders orders;

    public Output(Orders orders) {
        this.orders = orders;
    }

    public void printResult() {
        printOrder();
        printService();
        printTotalPrice();
    }

    private void printOrder() {
        System.out.println(OutputMessage.ORDER_DETAILS_HEADER.getMessage());
        printOrderMenu();
        System.out.println(resultMessage("총 주문 금액", priceMessage(orders.totalOrderPrice())));
        System.out.println(resultMessage("배달비", priceMessage(orders.deliverPrice())));
    }

    private void printOrderMenu() {
        List<OrderMenuRes> orderMenus = orders.getOrderResult();

        for (OrderMenuRes orderMenu : orderMenus) {
            String menuMessage = menuMessage(orderMenu.name(), orderMenu.quantity());
            String priceMessage = priceMessage(orderMenu.payment());
            System.out.println(resultMessage(menuMessage, priceMessage));
        }
    }

    private void printService() {
        System.out.println(OutputMessage.SERVICE_HEADER.getMessage());
        System.out.println(OutputMessage.SERVICE.serviceMessage(orders.calculateServiceQuantity()));
    }

    private void printTotalPrice() {
        System.out.println(OutputMessage.TOTAL_PRICE_HEADER.getMessage());
        System.out.println(priceMessage(orders.totalPrice()));
    }

    private String menuMessage(String menu, int quantity) {
        return menu + "(" + quantity + ")";
    }

    private String priceMessage(int price) {
        return String.format("%,d", price) + "원";
    }

    private String resultMessage(String menuMessage, String priceMessage) {
        return menuMessage + ": " + priceMessage;
    }
}
