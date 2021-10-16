package problems.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PlusOneTest {
    private final PlusOne plusOne = new PlusOne();

    /**
     * <b>case 1</b>
     * Input: digits = [1,2,3]
     * <br>
     * Output: [1,2,4]
     * <br>
     * Explanation: The array represents the integer 123.
     * <br>
     * Incrementing by one gives 123 + 1 = 124.
     * <br>
     * Thus, the result should be [1,2,4].
     */
    @Test
    void case1() {
        int[] digits = {1, 2, 3};
        assertThat(plusOne.plusOne(digits)).containsExactly(1, 2, 4);
    }

    /*
     * <b>case 2</b>
     * <br>
     * Input: digits = [4,3,2,1]
     * <br>
     * Output: [4,3,2,2]
     * <br>
     * Explanation: The array represents the integer 4321.
     * <br>
     * Incrementing by one gives 4321 + 1 = 4322.
     * <br>
     * Thus, the result should be [4,3,2,2].
     */
    @Test
    void case2() {
        int[] digits = {4, 3, 2, 1};
        assertThat(plusOne.plusOne(digits)).containsExactly(4, 3, 2, 2);
    }

    /**
     * <b>case 3</b>
     * <br>
     * Input: digits = [0]
     * Output: [1]
     * <br>
     * Explanation: The array represents the integer 0.
     * <br>
     * Incrementing by one gives 0 + 1 = 1.
     * <br>
     * Thus, the result should be [1].
     */
    @Test
    void case3() {
        int[] digits = {0};
        assertThat(plusOne.plusOne(digits)).containsExactly(1);
    }

    /**
     * <b>case 4</b>
     * <br>
     * Input: digits = [9]
     * <br>
     * Output: [1,0]
     * <br>
     * Explanation: The array represents the integer 9.
     * <br>
     * Incrementing by one gives 9 + 1 = 10.
     * <br>
     * Thus, the result should be [1,0].
     * <br>
     */
    @Test
    void case4() {
        int[] digits = {9};
        assertThat(plusOne.plusOne(digits)).containsExactly(1, 0);

    }

    @Test
    void case5() {
        int[] digits = {7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 6};
        assertThat(plusOne.plusOne(digits)).containsExactly(7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 7);

    }

}
