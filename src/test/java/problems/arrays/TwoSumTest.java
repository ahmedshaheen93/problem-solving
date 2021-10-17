package problems.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TwoSumTest {
    private final TwoSum twoSum = new TwoSum();

    /**
     * <b>case 1</b>
     * <br>
     * Input: nums = [2,7,11,15], target = 9
     * <br>
     * Output: [0,1]
     * <br>
     * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
     */
    @Test
    void case1() {
        int[] nums = {2, 7, 11, 15};
        assertThat(twoSum.twoSum(nums, 9)).containsExactly(0, 1);
    }

    /**
     * <b>case 2</b>
     * <br>
     * Input: nums = [3,2,4], target = 6
     * <br>
     * Output: [1,2]
     */
    @Test
    void case2() {
        int[] nums = {3, 2, 4};
        assertThat(twoSum.twoSum(nums, 6)).containsExactly(1, 2);
    }

    /**
     * <b>case 3</b>
     * Input: nums = [3,3], target = 6
     * <br>
     * Output: [0,1]
     */
    @Test
    void case3() {
        int[] nums = {3, 3};
        assertThat(twoSum.twoSum(nums, 6)).containsExactly(0, 1);
    }

}
