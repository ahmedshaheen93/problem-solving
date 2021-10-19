package problems.strings;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.
 *
 *
 *
 * <br>
 * For Example:
 * <br>
 * <b>case 1</b>
 * <br>
 * Input: x = 123
 * Output: 321
 * <br>
 * <b>case 2</b>
 * <br>
 * Input: x = -123
 * Output: -321
 * <br>
 * <b>case 3</b>
 * Input: x = 120
 * Output: 21
 * <br>
 * <b>case 4</b>
 * <br>
 * Input: x = 0
 * Output: 0
 */

public class ReverseInteger {
    public int reverse(int x) {
        if (x == 0) {
            return x;
        }
        String substring = new StringBuilder(String.valueOf(x)).reverse().toString();
        if (substring.endsWith("-")) {
            substring = substring.substring(0, substring.length() - 1);
            substring = "-" + substring;
        }
        double parseDouble = Double.parseDouble(substring);
        if (parseDouble < Integer.MIN_VALUE || parseDouble > Integer.MAX_VALUE) {
            return 0;
        }
        return Integer.parseInt(substring);
    }
}
