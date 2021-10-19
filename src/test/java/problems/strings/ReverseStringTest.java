package problems.strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseStringTest {
    private final ReverseString reverseString = new ReverseString();

    /**
     * <b>case 1</b>
     * Input: s = ['h','e','l','l','o']
     * Output: ['o','l','l','e','h']
     */
    @Test
    void case1() {
        char[] s = {'h', 'e', 'l', 'l', 'o' };
        reverseString.reverseString(s);
        assertThat(s).containsExactly('o', 'l', 'l', 'e', 'h');
    }

    /**
     * * <b>case 2</b>
     * Input: s = ['H','a','n','n','a','h']
     * Output: ['h','a','n','n','a','H']
     */
    @Test
    void case2() {
        char[] s = {'H', 'a', 'n', 'n', 'a', 'h' };
        reverseString.reverseString(s);
        assertThat(s).containsExactly('h', 'a', 'n', 'n', 'a', 'H');
    }
}
