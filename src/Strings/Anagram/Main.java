import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String str = "abcadbcbb";
        int length = lengthOfLongestSubstring(str);
        if (length == 0) {
            System.out.println("No non-repeating character substring found");
        } else {
            System.out.print(length + " (");
            String[] substrings = findAllLongestSubstrings(str, length);
            System.out.println(String.join(", ", substrings) + " are the longest string)");
        }
    }

    public static int lengthOfLongestSubstring(String str) {
        int start = 0;
        int maxLen = 0;
        Map<Character, Integer> usedChars = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (usedChars.containsKey(c) && usedChars.get(c) >= start) {
                start = Math.max(start, usedChars.get(c) + 1);
            }
            usedChars.put(c, i);
            maxLen = Math.max(maxLen, i - start + 1);
        }

        return maxLen;
    }

    public static String[] findAllLongestSubstrings(String str, int maxLength) {
        int start = 0;
        List<String> allSubstrings = new ArrayList<>();
        Map<Character, Integer> usedChars = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (usedChars.containsKey(c) && usedChars.get(c) >= start) {
                start = Math.max(start, usedChars.get(c) + 1);
            }
            usedChars.put(c, i);

            // Check if current substring is of max length
            if (i - start + 1 == maxLength) {
                allSubstrings.add(str.substring(start, i + 1));
            }
        }

        return allSubstrings.toArray(new String[0]);
    }
}
