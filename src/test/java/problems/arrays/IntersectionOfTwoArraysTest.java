package problems.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IntersectionOfTwoArraysTest {
    private final IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();

    /**
     * <b>case 1</b>
     * <br>
     * Input: nums1 = [1,2,2,1], nums2 = [2,2]
     * <br>
     * Output: [2,2]
     * <br>
     */
    @Test
    void case1() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] output = {2, 2};
        assertThat(intersectionOfTwoArrays.intersect(nums1, nums2)).containsExactly(output);
    }

    /**
     * <b>case 2</b>
     * <br>
     * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
     * <br>
     * Output: [4,9]
     * <br>
     * Explanation: [9,4] is also accepted.
     */
    @Test
    void case2() {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] output = {4, 9};
        assertThat(intersectionOfTwoArrays.intersect(nums1, nums2)).containsExactly(output);
    }
}
