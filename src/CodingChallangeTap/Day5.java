package CodingChallangeTap;

import java.util.ArrayList;
import java.util.Scanner;

public class Day5 {
    public static void common_fac(int n1, int n2, int y)
    {
        int count=1;
        for (int i = 2; count<=y ; i++) {
            if(i%n1==0 && i%n2==0)
            {
                System.out.print(i+" ");
                count++;
            }
        }

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter 1st Integer :");
        int n1=scan.nextInt();
        System.out.print("Enter 2nd Integer :");
        int n2=scan.nextInt();
        System.out.print("Enter No of item to show :");
        int y=scan.nextInt();
        common_fac(n1,n2,y);
    }
}
