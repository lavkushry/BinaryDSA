package CodingChallangeTap;

import java.util.Scanner;

public class Day2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();

        for (int i = 1; i <=n-1; i++) {
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
