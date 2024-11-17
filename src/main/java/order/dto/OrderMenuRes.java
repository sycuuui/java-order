package order.dto;

public record OrderMenuRes(
        String name,
        int quantity,
        int payment
) {
}
