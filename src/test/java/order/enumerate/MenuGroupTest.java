package order.enumerate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MenuGroupTest {
    @DisplayName("음료 그룹인지 잘 판단하는지 테스트")
    @Test
    void 음료_그룹인지_잘_판단하는지_테스트() {
        boolean result = MenuGroup.isBeverage(Menu.ORANGE_JUICE);

        assertThat(result).isEqualTo(true);
    }

    @DisplayName("메인 그룹인지 잘 판단하는지 테스트")
    @Test
    void 메인_그룹인지_잘_판단하는지_테스트() {
        boolean result = MenuGroup.isMain(Menu.CHEESESTICK);

        assertThat(result).isEqualTo(false);
    }
}
