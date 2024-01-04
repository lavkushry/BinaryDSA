package Mathematics;

import java.util.Scanner;

public class GCD_BruitforceApproach {

    static int Gcd(int a, int b){
        int min=0;
        if(a<b){
            min=a;
        }else {
            min=b;
        }
        for(int i=min; i>=1; i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }

        return 1;
    }

    static int Euclid_gcd(int a, int b){
        while (a!=b){
            if(a>b){
                a=a-b;
            }else {
                b=b-a;
            }
            return a;
        }
        return 1;
    }


     static int Gabrial_Gcd(int a, int b){
        while (a!=0&&b!=0){
            if(a>b){
                a=a%b;
            }else {
                b=b%a;
            }
        }
        if(a!=0){
            return a;
        }else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the both Number ");
        int a=sc.nextInt();
        int b=sc.nextInt();
//        System.out.println("the GCD is "+Gcd(a,b));
//        System.out.println("the GCD is "+Euclid_gcd(a,b));
        System.out.println("the GCD is "+Gabrial_Gcd(a,b));
    }
}
