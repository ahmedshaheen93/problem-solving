package problems.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 *
 *
 * <br>
 * For Example:
 * <br>
 * <b>case 1</b>
 * <br>
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * <br>
 * <b>case 2</b>
 * <br>
 * Input: s = "rat", t = "car"
 * Output: false
 * <br>
 */

public class ValidAnagram {
    public boolean isAnagram(String firstString, String secondString) {
        if (firstString.length() != secondString.length()) {
            return false;
        }
        Map<String, Integer> map1 = generateMap(firstString);
        Map<String, Integer> map2 = generateMap(secondString);
        return map2.equals(map1);
    }

    private Map<String, Integer> generateMap(String s) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String key = s.substring(i, i + 1);
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        return map;
    }
}
