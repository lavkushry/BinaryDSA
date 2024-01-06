package Bit_Manuplation;
// Finding the Right Most Set Bit using Bruteforce method

import java.util.Scanner;

public class Find_Righ_most_Set_bit_efficient {
    public static int findRSMB(int n){
        return ((int)(Math.log10(n^(n&(n-1)))/Math.log10(2))+1);
    }
    public static void main(String[] args) {
        System.out.println(" Enter the decimal No ");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(findRSMB(n));
    }
}
