package problems.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * <p>
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 *
 *
 *
 * <br>
 * For Example:
 * <br>
 * <b>case 1</b>
 * Input: nums = [2,2,1]
 * <br>
 * Output: 1
 * <br>
 * <b>case 2</b>
 * <br>
 * Input: nums = [4,1,2,1,2]
 * <br>
 * Output: 4
 * <br>
 * <b>case 3</b>
 * <br>
 * Input: nums = [1]
 * <br>
 * Output: 1
 * <br>
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int number : nums) {
            if (map.containsKey(number)) {
                map.replace(number, map.get(number) + 1);
            } else {
                map.put(number, 1);
            }
        }
        int singleNumber = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                singleNumber = entry.getKey();
                break;
            }
        }
        return singleNumber;
    }
}
