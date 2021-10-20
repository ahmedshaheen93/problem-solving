package problems.strings;

/**
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 *
 * <br>
 * For Example:
 * <br>
 * <b>case 1</b>
 * <br>
 * Input: s = "leetcode"
 * Output: 0
 * <br>
 * <b>case 2</b>
 * <br>
 * Input: s = "loveleetcode"
 * Output: 2
 * <br>
 * <b>case 3</b>
 * Input: s = "aabb"
 * Output: -1
 * <br>
 */

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        if (s.length() == 0) {
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            boolean found = false;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && i != j) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i;
            }
        }
        return -1;
    }
}
