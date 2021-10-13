package problems.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ContainsDuplicateTest {
    private final ContainsDuplicate containsDuplicate = new ContainsDuplicate();

    /**
     * <b>case 1</b>
     * <br>
     * Input: nums = [1,2,3,1]
     * <br>
     * Output: true
     * <br>
     */
    @Test
    void containsDuplicate_founded() {
        int[] nums = {1, 2, 3, 1};
        assertThat(containsDuplicate.containsDuplicate(nums)).isTrue();
    }

    /**
     * <b>case 2</b>
     * <br>
     * Input: nums = [1,2,3,4]
     * <br>
     * Output: false
     * <br>
     */
    @Test
    void containsDuplicate_not_founded() {
        int[] nums = {1, 2, 3, 4};
        assertThat(containsDuplicate.containsDuplicate(nums)).isFalse();
    }
}
