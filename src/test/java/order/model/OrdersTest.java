package order.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OrdersTest {
    private Orders orders;

    @BeforeEach
    void setup() {
        orders = new Orders();

        orders.addOrder(new Order("콜라", 2));
    }

    @DisplayName("음료만 주문할 경우 테스트")
    @Test
    void 음료만_주문할_경우_테스트() {
        boolean result = orders.checkMenuGroup();

        assertThat(result).isEqualTo(false);
    }

    @DisplayName("총 주문 가격 계산 테스트")
    @Test
    void 총_주문_가격_계산_테스트() {
        orders.addOrder(new Order("피자", 1));
        int result = orders.totalOrderPrice();
        //콜라 2*2000 + 피자 25000
        assertThat(result).isEqualTo(29000);
    }

    @DisplayName("서비스 수량 계산 테스트")
    @Test
    void 서비스_수량_계산_테스트() {
        orders.addOrder(new Order("피자", 3));
        int result = orders.calculateServiceQuantity();

        assertThat(result).isEqualTo(3);
    }

    @DisplayName("주문 가격 5만원 이하 배달비 계산 테스트")
    @Test
    void 주문_가격_5만원_이하_배달비_계산_테스트() {
        orders.addOrder(new Order("피자", 1));
        int result = orders.deliverPrice();
        //콜라 2*2000 + 피자 25000
        assertThat(result).isEqualTo(2000);
    }

    @DisplayName("주문 가격 10만원 이하 배달비 계산 테스트")
    @Test
    void 주문_가격_10만원_이하_배달비_계산_테스트() {
        orders.addOrder(new Order("피자", 3));
        int result = orders.deliverPrice();
        //콜라 2*2000 + 피자 3*25000
        assertThat(result).isEqualTo(1000);
    }

}
