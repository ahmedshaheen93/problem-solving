package problems.demos;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array and an Integer, create a function that lets a user know (true/false)
 * whether this array contains two elements that sum both of them equals the given Integer
 * <br>
 * For Example:
 * <b>case 1</b>
 * <br>
 * int[] array = {3, 6, 5, 4};
 * <br>
 * int x = 12;
 * <br>
 * <b>should return false</b>.
 * <br>
 * <b>case 2</b>
 * <br>
 * int[] array = {3, 6, 5, 4};
 * <br>
 * int x = 9;
 * <br>
 * <b>should return true.</b>
 * <br>
 */
public class FindPairOfSum {
    public boolean hasPairSumEquals(int[] array, int number) {
        Set<Integer> integers = new HashSet<>();
        for (int i : array) {
            if (integers.contains(i)) {
                return true;
            }
            integers.add(number - i);
        }
        return false;
    }
}
