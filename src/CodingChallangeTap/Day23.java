package CodingChallangeTap;
//🚀 hashtag#30DaysCodeAtTAPAcademy Challenge - Day 23 🚀
//
//Question:
//Write a program that swaps the cases of characters in a given string.
//
//        Example:
//String: "Hello World"
//Output: "hELLO wORLD"
public class Day23 {
    public static void swapsChar(String s) {
        String neu ="";
        for (int i = 0; i < s.length(); i++) {
            char n;
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                n=s.charAt(i);
               neu+=Character.toLowerCase(n);
            } else if (s.charAt(i) >= 'a' && s.charAt(i)<='z') {
                n=s.charAt(i);
                neu+= Character.toUpperCase(n);
            }

        }
        System.out.println(neu);
    }

    public static void main(String[] args) {
        String s = "Hello@3232World";
        swapsChar(s);
    }
}

