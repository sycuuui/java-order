package order.enumerate;

import java.util.Arrays;
import java.util.List;

public enum MenuGroup {
    MAIN(Arrays.asList(Menu.PIZZA, Menu.HAMBURGER, Menu.CHICKEN)),
    SIDE(Arrays.asList(Menu.FRENCHFRIES, Menu.CHEESESTICK, Menu.SALAD)),
    BEVERAGE(Arrays.asList(Menu.COLA, Menu.ZELO_COLA, Menu.ORANGE_JUICE));

    private List<Menu> menus;

    MenuGroup(List<Menu> menus) {
        this.menus = menus;
    }
}
