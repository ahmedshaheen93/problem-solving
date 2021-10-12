package problems.arrays;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 *
 * <br>
 * For Example:
 * <br>
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
public class RotateArray {
    public void rotate(int[] nums, int k) {

        for (int i = 0; i < k; i++) {
            // tack the last element
            int lastElement = nums[nums.length - 1];
            // rotate the array
            for (int j = 0; j < nums.length - 1; j++) {
                nums[nums.length - j - 1] = nums[nums.length - j - 2];
            }
            // put lastElement on position 0
            nums[0] = lastElement;
            System.out.println(StringUtils.join(ArrayUtils.toObject(nums), ","));
        }
    }
}
