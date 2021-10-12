package problems.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RotateArrayTest {
    private final RotateArray rotateArray = new RotateArray();

    /**
     * <b>case 1</b>
     * * <br>
     * Input: nums = [1,2,3,4,5,6,7], k = 3
     * * <br>
     * Output: [5,6,7,1,2,3,4]
     * * <br>
     * Explanation:*
     * <br>
     * rotate 1 steps to the right: [7,1,2,3,4,5,6]
     * <br>
     * rotate 2 steps to the right: [6,7,1,2,3,4,5]
     * <br>
     * rotate 3 steps to the right: [5,6,7,1,2,3,4]
     * <br>
     */
    @Test
    void rotateThreeTimes() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotateArray.rotate(nums, k);
        assertThat(nums).containsExactly(5, 6, 7, 1, 2, 3, 4);
    }

    /**
     * <b>case 2</b>
     * <br>
     * Input: nums = [-1,-100,3,99], k = 2
     * <br>
     * Output: [3,99,-1,-100]
     * <br>
     * Explanation:
     * <br>
     * rotate 1 steps to the right: [99,-1,-100,3]
     * <br>
     * rotate 2 steps to the right: [3,99,-1,-100]
     * <br>
     */
    @Test
    void rotateTwoTimes() {
        int[] nums = {-1, -100, 3, 99};
        int k = 2;
        rotateArray.rotate(nums, k);
        assertThat(nums).containsExactly(3, 99, -1, -100);
    }
}
