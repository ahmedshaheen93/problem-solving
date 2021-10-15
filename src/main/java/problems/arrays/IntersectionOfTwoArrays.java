package problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * <br>
 * Each element in the result must appear as many times as it shows in both arrays
 * <br>
 * and you may return the result in any order.
 *
 * <br>
 * For Example:
 * <br>
 * <b>case 1</b>
 * <br>
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * <br>
 * Output: [2,2]
 * <br>
 * <b>case 2</b>
 * <br>
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * <br>
 * Output: [4,9]
 * <br>
 * Explanation: [9,4] is also accepted.
 */

public class IntersectionOfTwoArrays {


    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> integerList = new ArrayList<>();
        int index1 = 0;
        int index2 = 0;
        while (index1 < nums1.length && index2 < nums2.length) {
            if (nums1[index1] == nums2[index2]) {
                integerList.add(nums1[index1]);
                index1++;
                index2++;
            } else if (nums1[index1] < nums2[index2]) {
                index1++;
            } else {
                index2++;
            }
        }
        int[] result = new int[integerList.size()];
        for (int i = 0; i < integerList.size(); i++) {
            result[i] = integerList.get(i);
        }
        return result;
    }
}
