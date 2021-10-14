package problems.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SingleNumberTest {
    private SingleNumber singleNumber = new SingleNumber();

    /**
     * <b>case 1</b>
     * Input: nums = [2,2,1]
     * <br>
     * Output: 1
     */
    @Test
    void case1() {
        int[] nums = {2, 2, 1};
        assertThat(singleNumber.singleNumber(nums)).isEqualTo(1);
    }

    /**
     * <b>case 2</b>
     * <br>
     * Input: nums = [4,1,2,1,2]
     * <br>
     * Output: 4
     */
    @Test
    void case2() {
        int[] nums = {4, 1, 2, 1, 2};
        assertThat(singleNumber.singleNumber(nums)).isEqualTo(4);
    }

    /**
     * <b>case 3</b>
     * <br>
     * Input: nums = [1]
     * <br>
     * Output: 1
     * <br>
     */
    @Test
    void case3() {
        int[] nums = {1};
        assertThat(singleNumber.singleNumber(nums)).isEqualTo(1);
    }
}
