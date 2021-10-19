package problems.strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseIntegerTest {
    private final ReverseInteger reverseInteger = new ReverseInteger();

    /**
     * <b>case 1</b>
     * <br>
     * Input: x = 123
     * Output: 321
     */
    @Test
    void case1() {
        assertThat(reverseInteger.reverse(123)).isEqualTo(321);
    }

    /**
     * <b>case 2</b>
     * <br>
     * Input: x = -123
     * Output: -321
     */
    @Test
    void case2() {
        assertThat(reverseInteger.reverse(-123)).isEqualTo(-321);
    }

    /**
     * <b>case 3</b>
     * Input: x = 120
     * Output: 21
     */
    @Test
    void case3() {
        assertThat(reverseInteger.reverse(120)).isEqualTo(21);
    }

    /**
     * <br>
     * <b>case 4</b>
     * <br>
     * Input: x = 0
     * Output: 0
     */
    @Test
    void case4() {
        assertThat(reverseInteger.reverse(0)).isZero();
    }

    /**
     * <br>
     * <b>case 5</b>
     * <br>
     * Input: x = 1534236469
     * Output: 0
     */
    @Test
    void case5() {
        assertThat(reverseInteger.reverse(1534236469)).isZero();
    }
}
