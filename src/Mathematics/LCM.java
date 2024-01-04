package Mathematics;

import java.util.Scanner;

public class LCM{
    static int LCM_b(int a, int b){
        int res=Math.max(a,b);
        while (true){
            if(res % a==0 && res%b==0){
                break;
            }
            res++;
        }
        return res;
    }
//LCM using Euclid GCD
    static int LCM_eu(int a, int b){
        GCD_BruitforceApproach gcd=new GCD_BruitforceApproach();
        int gcd1=gcd.Gabrial_Gcd(a,b);// this is Coming From  GCD_BruitforceApproac class
        return (a*b)/gcd1;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the Number which you want to find : ");
        int a=s.nextInt();
        int b=s.nextInt();
//        System.out.print("The LCM using bruteforce method id : "+LCM_b(a,b));
        System.out.print("The LCM using bruteforce method id : "+LCM_eu(a,b));
    }
}
