package Bit_Manuplation;

import java.util.Scanner;
// Finding the Right Most Set Bit using Bruteforce method
public class Find_Righ_most_Set_bit {
    public static int findRSMB(int n){
        int pos=0;
        int m=1;
        if(n==0){
            return -1;
        }
        while ((n&m)==0){
            m=m<<1;
            pos++;
        }
        return pos+1;
    }
    public static void main(String[] args) {
        System.out.println(" Enter the decimal No ");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(findRSMB(n));

    }
}
