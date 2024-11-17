package order.enumerate;

public enum Menu {
    PIZZA("피자", 25000),
    HAMBURGER("햄버거", 10000),
    CHICKEN("치킨", 23000),
    FRENCHFRIES("감자튀김", 5000),
    CHEESESTICK("치즈스틱", 7000),
    SALAD("샐러드", 8000),
    COLA("콜라", 2000),
    ZELO_COLA("제로 콜라", 2500),
    ORANGE_JUICE("오렌지 주스", 3000);

    private String name;
    private int price;

    Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public static Menu findByName(String name) {
        for (Menu menu : Menu.values()) {
            if (menu.getName().equals(name)) {
                return menu;
            }
        }
        return null;
    }
}
