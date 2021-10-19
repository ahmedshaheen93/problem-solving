package problems.strings;

/**
 * Write a function that reverses a string. The input string is given as an array of characters s.
 *
 *
 * <br>
 * For Example:
 * <br>
 * <b>case 1</b>
 * <br>
 * Input: s = ["h","e","l","l","o"]
 * <br>
 * Output: ["o","l","l","e","h"]
 * <br>
 * <b>case 2</b>
 * <br>
 * Input: s = ["H","a","n","n","a","h"]
 * <br>
 * Output: ["h","a","n","n","a","H"]
 * <br>
 */

public class ReverseString {

    public void reverseString(char[] s) {
        int index = s.length - 1;
        for (int i = 0; i < s.length / 2; i++) {
            char tmp = s[i];
            s[i] = s[index];
            s[index] = tmp;
            index--;
        }
    }

}
