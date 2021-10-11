package problems.demos;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindPairOfSumTest {
    private final FindPairOfSum findPairOfSum = new FindPairOfSum();

    /**
     * <b>case 1</b>
     * <br>
     * int[] array = {3, 6, 5, 4};
     * <br>
     * int x = 12;
     * <br>
     * <b>should return false</b>.
     */
    @Test
    void hasNotPairSumEquals() {
        int[] array = {3, 6, 5, 4};
        int number = 12;
        assertThat(findPairOfSum.hasPairSumEquals(array, number)).isFalse();
    }

    /**
     * <b>case 2</b>
     * <br>
     * int[] array = {3, 6, 5, 4};
     * <br>
     * int x = 9;
     * <br>
     * <b>should return true.</b>
     */

    @Test
    void hasPairSumEquals() {
        int[] array = {3, 6, 5, 4};
        int number = 9;
        assertThat(findPairOfSum.hasPairSumEquals(array, number)).isTrue();
    }
}
