package problems.strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidAnagramTest {
    private final ValidAnagram validAnagram = new ValidAnagram();

    /**
     * <b>case 1</b>
     * <br>
     * Input: s = "anagram", t = "nagaram"
     * Output: true
     */
    @Test
    void case1() {
        assertThat(validAnagram.isAnagram("anagram", "nagaram")).isTrue();
    }

    /**
     * <b>case 2</b>
     * <br>
     * Input: s = "rat", t = "car"
     * Output: false
     */
    @Test
    void case2() {
        assertThat(validAnagram.isAnagram("rat", "car")).isFalse();
    }
}
