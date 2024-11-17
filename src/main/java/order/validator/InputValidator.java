package order.validator;

import java.util.regex.Pattern;

public class InputValidator {
    public boolean orderValidator(String[] orders) {
        for (String orderMenu : orders) {
            if (checkOrderFormat(orderMenu)) {
                return false;
            }
            if (checkEmptyBySplit(orderMenu)) {
                return false;
            }
        }
        return true;
    }

    private boolean checkEmptyBySplit(String orderMenu) {
        return orderMenu.isEmpty();
    }

    private boolean checkOrderFormat(String orderMenu) {
        return Pattern.matches("[가-힣]+\\(\\d+개\\)", orderMenu);
    }
}
