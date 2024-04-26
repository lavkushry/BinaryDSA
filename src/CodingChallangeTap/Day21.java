package CodingChallangeTap;
import java.util.Scanner;
public class Day21 {
    public static int countVowel(String s)
    {
        String str=s.toLowerCase();
        int count=0;
        for (int i = 0; i <=str.length()-1; i++) {
            if(str.charAt(i)=='a'|| str.charAt(i)=='e' ||
                    str.charAt(i)=='i' || str.charAt(i)=='o' ||
                    str.charAt(i)=='u')
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str= scan.next();
        System.out.print(countVowel(str));
    }
}
