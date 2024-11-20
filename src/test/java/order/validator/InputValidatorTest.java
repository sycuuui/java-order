package order.validator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InputValidatorTest {
    private InputValidator inputValidator;

    @BeforeEach
    void setup() {
        inputValidator = new InputValidator();
    }

    @DisplayName("콤마 사이에 빈 값이 있을 경우 테스트")
    @Test
    void 콤마_사이에_빈_값이_있을_경우_테스트() {
        String order = "피자(2개),감자튀김(1개), ,콜라(3개)";
        String[] orders = order.split(",");

        boolean result = inputValidator.requestOrderValidator(orders);
        assertThat(result).isEqualTo(false);
    }

    @DisplayName("입력값 형식에 맞지 않을 경우 테스트")
    @Test
    void 입력값_형식에_맞지_않을_경우_테스트() {
        String order = "피자(2개),감자튀김(1)";
        String[] orders = order.split(",");

        boolean result = inputValidator.requestOrderValidator(orders);
        assertThat(result).isEqualTo(false);
    }
}
