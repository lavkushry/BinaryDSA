package CodingChallangeTap;

import java.util.Scanner;

public class Day6 {
    public  static int hcf(int x, int y){
            int hcf=0;
        for (int i = 1; i <=x || i<=y; i++) {
            if(x%i==0 && y%i==0)
            {
                hcf=i;
            }
        }
        return hcf;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter 1st Integer :");
        int n1=scan.nextInt();
        System.out.print("Enter 2nd Integer :");
        int n2=scan.nextInt();
        System.out.println("hcf is :"+hcf(n1,n2));
    }

}
