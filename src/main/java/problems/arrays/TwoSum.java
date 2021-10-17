package problems.arrays;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 *
 *
 *
 * <br>
 * For Example:
 * <br>
 * <b>case 1</b>
 * <br>
 * Input: nums = [2,7,11,15], target = 9
 * <br>
 * Output: [0,1]
 * <br>
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 * <br>
 * <b>case 2</b>
 * <br>
 * Input: nums = [3,2,4], target = 6
 * <br>
 * Output: [1,2]
 * <br>
 * <b>case 3</b>
 * Input: nums = [3,3], target = 6
 * <br>
 * Output: [0,1]
 */

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target - nums[i] == nums[j]) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
