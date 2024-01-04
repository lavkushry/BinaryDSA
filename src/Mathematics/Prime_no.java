package Mathematics;

import java.util.Scanner;

public class Prime_no {

    static boolean check_prime(int n){
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    static boolean check_prime_root(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    static boolean check_prime_root_plus6(int n){

        if(n==1){
            return false;
        }
        if(n==2 || n==3){
            return true;
        }
        if(n%2==0 || n%3==0){
            return false;
        }
        for(int i=5; i<=Math.sqrt(n); i+=5){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter the Number which you want to check");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
//        System.out.println(check_prime(n));
//        System.out.println(check_prime_root(n));
        System.out.println(check_prime_root_plus6(n));

    }
}
