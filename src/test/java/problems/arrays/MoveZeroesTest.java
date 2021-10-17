package problems.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MoveZeroesTest {
    private final MoveZeroes moveZeroes = new MoveZeroes();

    /**
     * <br>
     * <b>case 1</b>
     * Input: nums = [0,1,0,3,12]
     * <br>
     * Output: [1,3,12,0,0]
     */
    @Test
    void case1() {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes.moveZeroes(nums);
        assertThat(nums).containsExactly(1, 3, 12, 0, 0);
    }

    /**
     * <b>case 2</b>
     * Input: nums = [0]
     * <br>
     * Output: [0]
     */
    @Test
    void case2() {
        int[] nums = {0};
        moveZeroes.moveZeroes(nums);
        assertThat(nums).containsExactly(0);
    }

    /**
     * <b>case 3</b>
     * Input: nums = [0,0,1]
     * <br>
     * Output: [1,0,0]
     */
    @Test
    void case3() {
        int[] nums = {0, 0, 1};
        moveZeroes.moveZeroes(nums);
        assertThat(nums).containsExactly(1, 0, 0);
    }
}
