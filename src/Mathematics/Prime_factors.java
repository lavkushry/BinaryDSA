package Mathematics;

import java.util.Scanner;
// Find the Prime Factors of N
public class Prime_factors {
    public static void primeFactors(int n){
        int i=2;
        while (n>1){
            while (n%i==0){
                System.out.print(i+",");
                n=n/i;
            }
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        primeFactors(n);
    }
}
