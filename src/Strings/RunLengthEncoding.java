/*Have the function stringchallenge (str)
take the stz parameter being passed and
return a compressed version of the string using
the Run-length encoding algorithm. This
algorithm works by taking the occurrence of
each repeating character and outputting that
number along with a single character of the
repeating sequence. For example: "wwwggopp"
would return 3w2g102p. The string will not
contain any numbers, punctuation, or symbols.
Once your function is working, take the final
output string and remove any characters
(case-insensitive) from it that appear in your
challengeToken. If the new final string is
empty, return the string EMPTY.
Examples
Input: "aabbcde"
Output: 2a2b1c1dle
Final Output: ae
*/
public class RunLengthEncoding {

    public static String runLengthEncoding(String str) {
        int ctr = 0;
        StringBuilder output = new StringBuilder();
        char data = str.charAt(0);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == data) {
                ctr++;
            } else {
                output.append(ctr).append(data);
                data = str.charAt(i);
                ctr = 1;
            }
        }

        // Append the count and character for the last run
        output.append(ctr).append(data);

        return String.format("Input: %s\nOutput: %s\nFinal Output: %c%c", str, output.toString(), str.charAt(0), str.charAt(str.length() - 1));
    }

    public static void main(String[] args) {
        String string = "aabbcde";
        String result = runLengthEncoding(string);
        System.out.println(result);
    }
}
