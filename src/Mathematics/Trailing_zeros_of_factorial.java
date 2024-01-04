package Mathematics;

import java.util.Scanner;

public class Trailing_zeros_of_factorial {

    static int trail_zero(int num){
        int res =0;
       int  pow_of_5=5;
       while(pow_of_5<num){
           res=res+(num/pow_of_5);
           pow_of_5=pow_of_5*5;
       }
       return res;
    }
    public static void main(String[] args) {
        System.out.println("Enter the Factorail Number");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("The trailing zero of Num is : "+trail_zero(n));
    }
}
