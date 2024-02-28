package Strings;

import java.util.Scanner;

//Write a Java program to reverse a given string without using the built-in reverse() method
public class RevArraywof_rev {

    public static String revStr(String s)
    {
        String rev="";
        for (int i =0; i<s.length(); i++) {
            rev=s.charAt(i)+rev;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String you want to rev");
        String str= scan.next();
        System.out.println("Reversed Str is :"+revStr(str));
    }
}
