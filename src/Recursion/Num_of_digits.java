package Recursion;

import java.util.Scanner;
public class Num_of_digits {

    public static int countDigits(int n){
        int count=1;
        if(n==0){
            return 0;
        }else {
            int ans=countDigits(n/10);
            count=count+ans;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Enter n Num: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Sum till Entered Num is : "+countDigits(n));
    }
}
