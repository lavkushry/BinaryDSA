package Recursion;

import java.util.Scanner;

public class X_to_pow_n {
    static int  pow_of_x(int a, int b){
        if(b==0){
            return 1;
        }
        return a*pow_of_x(a,b-1);
    }

    public static void main(String[] args) {
        System.out.print("Enter both Number Which you want to first ins num and 2nd is pow : ");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("The final result is : "+pow_of_x(a,b));
    }
}
