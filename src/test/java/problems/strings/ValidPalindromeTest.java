package problems.strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidPalindromeTest {
    private final ValidPalindrome validPalindrome = new ValidPalindrome();

    /**
     * <b>case 1</b>
     * <br>
     * Input: s = "A man, a plan, a canal: Panama"
     * Output: true
     * <br>
     * Explanation: "amanaplanacanalpanama" is a palindrome.
     * <br>
     */
    @Test
    void case1() {
        String s = "A man, a plan, a canal: Panama";
        assertThat(validPalindrome.isPalindrome(s)).isTrue();
    }

    /**
     * <b>case 2</b>
     * <br>
     * Input: s = "race a car"
     * Output: false
     * <br>
     * Explanation: "raceacar" is not a palindrome.
     */
    @Test
    void case2() {
        String s = "race a car";
        assertThat(validPalindrome.isPalindrome(s)).isFalse();
    }

    /**
     * <b>case 3</b>
     * <br>
     * Input: s = " "
     * Output: true
     * <br>
     * Explanation: s is an empty string "" after removing non-alphanumeric characters.
     * Since an empty string reads the same forward and backward, it is a palindrome.
     */
    @Test
    void case3() {
        String s = " ";
        assertThat(validPalindrome.isPalindrome(s)).isTrue();
    }
}
