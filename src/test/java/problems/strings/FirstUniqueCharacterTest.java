package problems.strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FirstUniqueCharacterTest {
    private final FirstUniqueCharacter firstUniqueCharacter = new FirstUniqueCharacter();

    /**
     * <b>case 1</b>
     * <br>
     * Input: s = "leetcode"
     * Output: 0
     */
    @Test
    void case1() {
        assertThat(firstUniqueCharacter.firstUniqChar("leetcode")).isZero();
    }

    /**
     * <b>case 2</b>
     * <br>
     * Input: s = "loveleetcode"
     * Output: 2
     */
    @Test
    void case2() {
        assertThat(firstUniqueCharacter.firstUniqChar("loveleetcode")).isEqualTo(2);
    }

    /**
     * Input: s = "aabb"
     * Output: -1
     */
    @Test
    void case3() {
        assertThat(firstUniqueCharacter.firstUniqChar("aabb")).isEqualTo(-1);
    }
}
