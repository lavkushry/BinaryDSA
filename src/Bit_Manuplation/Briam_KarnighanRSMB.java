package Bit_Manuplation;
// Finding the All Set Bit using Brian Karnighan's Algorithm  method

import java.util.Scanner;


public class Briam_KarnighanRSMB {
    public static int findRSMB( int n){
        int count=0;
        while (n>0){
            n=n*(n-1);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(" Enter the decimal No ");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(findRSMB(n));
    }


}
