package Recursion;

import java.util.Scanner;

public class Sum_of_n {

    static int sum(int n){
        if(n==1){
            return 1;
        }
        return sum(n-1)+n;
    }
    public static void main(String[] args) {
        System.out.println("Enter n Num: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Sum till Entered Num is : "+sum(n));
    }
}
