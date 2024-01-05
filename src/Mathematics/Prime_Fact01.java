package Mathematics;

import java.util.Scanner;
// Find the Prime Factors of N
public class Prime_Fact01 {
    public static void primeFactors(int n){
        int i=2;
        while (i*i<=n){
            while (n%i==0){
                System.out.print(i+"x");
                n=n/i;
            }
            i++;
        }
        if (n>1) {
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        primeFactors(n);
    }
}
