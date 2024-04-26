package CodingChallangeTap;
//Question:
//Write a program that prints all the substrings of a given string.
//
//Example:
//String: "abc"
//Substrings: "a", "ab", "abc", "b", "bc", "c"
public class Day27 {

    public static void subString(String s)
    {
        String nstr="";
        for (int i = 0; i < s.length(); i++) {

            for (int j = i; j <=s.length(); j++) {
                System.out.print('"'+s.substring(i,j)+ '"'+", ");
            }

        }
    }
    public static void main(String[] args) {
        String s="abc";
        subString(s);
    }
}
