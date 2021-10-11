package problems.demos;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given 2 arrays, create a function that lets a user know (true/false) whether these two arrays contain any common items
 * <br>
 * For Example:
 * <b>case 1</b>
 * <br>
 * String[] array1 = {'a', 'b', 'c', 'x'};
 * <br>
 * String[] array2 = {'z', 'y', 'i'};
 * <br>
 * <b>should return false</b>.
 * <br>
 * <b>case 2</b>
 * <br>
 * String[] array1 = {'a', 'b', 'c', 'x'};
 * <br>
 * String[] array2 = {'z', 'y', 'x'};
 * <br>
 * <b>should return true.</b>
 * <br>
 */
public class FindCommonItems {

    public boolean containAnyCommonItems(String[] array1, String[] array2) {
        Set<String> strings = new HashSet<>(List.of(array1));
        for (String s : array2) {
            if (strings.contains(s)) {
                return true;
            }
        }
        return false;
    }
}
