package order.message;

public enum ErrorMessage {
    ORDER("주문 형식에 맞지 않습니다. 다시 입력해주세요."),
    ONLY_BEVERAGE("음료만으로는 주문할 수 없습니다."),
    MIN_ORDER_PRICE("최소 주문 금액을 만족하지 못했습니다.");

    String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
