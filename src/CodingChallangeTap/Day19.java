package CodingChallangeTap;
import java.util.Scanner;
public class Day19 {
    public static void rev(String s)
    {
        String nstr="";
        char ch;
        for (int i=0; i<s.length(); i++)
        {
            ch= s.charAt(i);
            nstr= ch+nstr;
        }
        System.out.println(nstr);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String st=scan.next();
        rev(st);
    }
}
