package CodingChallangeTap;
import java.util.Scanner;
public class Day20 {
    public static void palindrome(String str){
        String n="";
        for (int i = str.length()-1; i >=0; i--) {
            n=n+str.charAt(i);
        }
        if(str.equals(n)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String str= scan.next();
        palindrome(str);


    }
}
