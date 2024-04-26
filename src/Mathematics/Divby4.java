package Mathematics;

import java.util.Scanner;

public class Divby4 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int a=scan.nextInt();
        if(divByFour(a)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    static  boolean divByFour(int n){
        int count=0;
        int newnum=0;
        while (n<0){
            int rem=n%10;
            newnum=newnum+10*rem;
            count++;
            if(count==2){
                break;
            }
        }
        if(newnum%4==0){
            return true;
        }
        return false;
    }
}
