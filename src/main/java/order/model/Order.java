package order.model;

import order.enumerate.Menu;

public class Order {
    private final Menu menu;
    private final int quantity;

    public Order(String name, int quantity) {
        this.menu = findMenu(name);
        this.quantity = quantity;
    }

    public Menu getMenu() {
        return menu;
    }

    public int getQuantity() {
        return quantity;
    }

    private Menu findMenu(String name) {
        Menu findmenu = Menu.findByName(name);
        if (findmenu == null) {
            throw new IllegalArgumentException();
        }

        return findmenu;
    }
}
