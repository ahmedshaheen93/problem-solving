package problems.arrays;

import java.math.BigInteger;

/**
 * You are given a large integer represented as an integer array digits,where each digits[i] is the ith digit of the integer.
 * <p>
 * The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
 * <p>
 * Increment the large integer by one and return the resulting array of digits.
 *
 *
 * <br>
 * For Example:
 * <br>
 * <b>case 1</b>
 * Input: digits = [1,2,3]
 * <br>
 * Output: [1,2,4]
 * <br>
 * Explanation: The array represents the integer 123.
 * <br>
 * Incrementing by one gives 123 + 1 = 124.
 * <br>
 * Thus, the result should be [1,2,4].
 * <br>
 * <b>case 2</b>
 * <br>
 * Input: digits = [4,3,2,1]
 * <br>
 * Output: [4,3,2,2]
 * <br>
 * Explanation: The array represents the integer 4321.
 * <br>
 * Incrementing by one gives 4321 + 1 = 4322.
 * <br>
 * Thus, the result should be [4,3,2,2].
 * <br>
 * <b>case 3</b>
 * <br>
 * Input: digits = [0]
 * Output: [1]
 * <br>
 * Explanation: The array represents the integer 0.
 * <br>
 * Incrementing by one gives 0 + 1 = 1.
 * <br>
 * <br>
 * Thus, the result should be [1].
 * <b>case 4</b>
 * <br>
 * Input: digits = [9]
 * <br>
 * Output: [1,0]
 * <br>
 * Explanation: The array represents the integer 9.
 * <br>
 * Incrementing by one gives 9 + 1 = 10.
 * <br>
 * Thus, the result should be [1,0].
 * <br>
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int digit : digits) {
            stringBuilder.append(digit);
        }
        BigInteger bigDecimal = new BigInteger(stringBuilder.toString());
        String sumString = String.valueOf(bigDecimal.add(BigInteger.ONE));
        int[] result = new int[sumString.length()];
        for (int i = 0; i < sumString.length(); i++) {
            result[i] = Integer.parseInt("" + sumString.charAt(i));
        }
        return result;
    }
}
