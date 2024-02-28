package CodingChallangeTap;

import java.util.Scanner;

public class Day7 {

    public static boolean isPalindrome(int x) {
        int rev=0;
        if (x < 0)
            return false;
        long reversed = 0;
        int y = x;

        while (y > 0) {
            reversed = reversed * 10 + y % 10;
            y /= 10;
        }

        return reversed == x;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number Which you want to check :");
        int x= scan.nextInt();
        if(isPalindrome(x)==true){
            System.out.print("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}

