package problems.arrays;

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * <p>
 * Note that you must do this in-place without making a copy of the array.
 *
 *
 *
 * <br>
 * For Example:
 * <br>
 * <b>case 1</b>
 * Input: nums = [0,1,0,3,12]
 * <br>
 * Output: [1,3,12,0,0]
 * <br>
 * <b>case 2</b>
 * Input: nums = [0]
 * <br>
 * Output: [0]
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
