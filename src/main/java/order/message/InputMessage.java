package order.message;

public enum InputMessage {
    ORDER_MESSAGE("주문하실 메뉴와 수량을 입력해주세요. ex) 피자(2개),감자튀김(1개),콜라(3개)");

    final String message;

    InputMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
