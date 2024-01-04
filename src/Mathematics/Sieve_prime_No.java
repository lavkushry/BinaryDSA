package Mathematics;

import java.util.Scanner;

//find Last n prime no using Sieve Erotosthenese
public class Sieve_prime_No {

    public static void sieveprintprime(int n){
        boolean[] prime=new boolean[n+1];
        for(int i=2; i<=n; i++){
            if(prime[i]==false){
                for(int j=i*2; j<=n; j=j+i){
                    prime[j]=true;
                }
            }
        }
        for (int i=2; i<=n; i++){
            if(prime[i]==false){
                System.out.println(i);
            }
        }

    }//Usine Bruteforce method
    public static void sieveprintprime_improved(int n) {//Improved method
        boolean[] prime = new boolean[n + 1];
        for (int i = 2; i * i <= n; i++) {
            if (prime[i] == false) {
                for (int j = i * i; j <= n; j = j + i) {
                    prime[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (prime[i] == false) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the N value for Prime no");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
//        sieveprintprime(num);
        sieveprintprime_improved(num);
//        System.out.println(sieveprintprime(num));
    }
}
