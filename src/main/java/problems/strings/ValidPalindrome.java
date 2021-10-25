package problems.strings;

/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 * <p>
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * <br>
 * For Example:
 * <br>
 * <b>case 1</b>
 * <br>
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * <br>
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * <br>
 * <b>case 2</b>
 * <br>
 * Input: s = "race a car"
 * Output: false
 * <br>
 * Explanation: "raceacar" is not a palindrome.
 * <br>
 * <b>case 3</b>
 * <br>
 * Input: s = " "
 * Output: true
 * <br>
 * Explanation: s is an empty string "" after removing non-alphanumeric characters.
 * Since an empty string reads the same forward and backward, it is a palindrome.
 * <br>
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder stringBuilder = clearString(s);
        s = stringBuilder.toString();
        String s1 = stringBuilder.reverse().toString();
        return s1.equals(s);
    }

    private StringBuilder clearString(String s) {
        s = s.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (Character.isLetterOrDigit(c)) {
                stringBuilder.append(c);
            }
        }
        return stringBuilder;
    }
}
