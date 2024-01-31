package Bit_Manuplation;

import java.util.Scanner;

public class pow_of_2_adobe_main {
    static boolean pow_of_2(int n)
    {
        if (n==0)
        {
            return false;
        }
        return (n & (n-1))==0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(pow_of_2(n));
    }
}
