package order.enumerate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MenuTest {
    @DisplayName("Menu enum 값이 없을 경우 테스트")
    @Test
    void Menu_enum_값이_없을_경우_테스트() {
        Menu result = Menu.findByName("떡볶이");

        assertThat(result).isEqualTo(null);
    }

    @DisplayName("Menu enum 값이 있을 경우 테스트")
    @Test
    void Menu_enum_값이_있을_경우_테스트() {
        Menu result = Menu.findByName("제로 콜라");

        assertThat(result).isEqualTo(Menu.ZELO_COLA);
    }
}
