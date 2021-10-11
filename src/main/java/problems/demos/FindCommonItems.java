package problems.demos;

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
        for (String value : array1) {
            for (String s : array2) {
                if (value.equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }
}
