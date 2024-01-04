package Recursion;

import java.util.Scanner;

public class Print_number {

    public static void Print(int n){
        if(n==0){
            return;
            }
        System.out.print(n+" ");
        Print(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        System.out.print("Enter the num till you want generate : ");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        Print(a);
    }
}
