package order.view;

import order.message.ErrorMessage;
import order.message.InputMessage;
import order.validator.InputValidator;

import java.util.Scanner;

public class Input {
    private InputValidator inputValidator;
    private Scanner scanner;

    public Input() {
        inputValidator = new InputValidator();
        scanner = new Scanner(System.in);
    }

    public String[] requestOrder() {
        System.out.println(InputMessage.ORDER_MESSAGE.getMessage());
        String input = scanner.nextLine();
        String[] orders = input.split(",");

        if (!inputValidator.requestOrderValidator(orders)) {
            System.out.println(ErrorMessage.ORDER.getMessage());
            throw new IllegalArgumentException(ErrorMessage.ORDER.getMessage());
        }

        return orders;
    }

}
