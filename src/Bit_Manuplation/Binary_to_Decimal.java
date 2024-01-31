package Bit_Manuplation;
//Write a Code to Convert Binary to decimal
import java.util.Scanner;

public class Binary_to_Decimal {
    public static int binarytodecimal(String n){
        int res=0;
        int Pow_of_2=1;
        for (int i = n.length()-1; i >=0; i--) {
            if (n.charAt(i) == '1') {
                res=res+Pow_of_2;
            }
            Pow_of_2=Pow_of_2*2;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        System.out.println(binarytodecimal(n));
    }
}
