package order.message;

import java.text.Format;

public enum OutputMessage {
    ORDER_DETAILS_HEADER("\n[주문 내역]"),
    SERVICE_HEADER("\n[서비스]"),
    TOTAL_PRICE_HEADER("\n[최종 결제 금액]"),
    SERVICE("서비스 만두");

    private String message;

    OutputMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String serviceMessage(int quantity) {
        return SERVICE.message + "(" + quantity + "개)";
    }
}
