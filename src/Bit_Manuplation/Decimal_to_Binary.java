package Bit_Manuplation;
//Program to Convering Decimal to Binary

import java.util.Scanner;
public class Decimal_to_Binary {
    public static String decimaltobinary(int n){
        String b="";
        while (n>=1){
            int x=n%2;
            n=n/2;
            b=x+b;// Need to put int + String if you do b+x Then Program goes to wrong
        }

        return b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(decimaltobinary(n));
    }
}
