package order.model;

import order.enumerate.Menu;

public class Order {
    private final Menu menu;
    private final int quantity;

    public Order(String name, int quantity) {
        this.menu = Menu.findByName(name);
        this.quantity = quantity;
    }

    public Menu getMenu() {
        return menu;
    }

    public int getQuantity() {
        return quantity;
    }
}
