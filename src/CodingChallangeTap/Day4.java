
//    Write a program that takes two integers, n1 and n2, as input and prints the common factors of n1 and n2
//            Example:
//    Input: n1 = 12, n2 = 18
//    Output: 1, 2, 3, 6

package CodingChallangeTap;
import java.util.ArrayList;
import java.util.Scanner;

public class Day4 {

    public static ArrayList<Integer> common_fac(int n1, int n2){
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1%i==0 && n2%i==0)
            {
                arr.add(i);
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter 1st Integer :");
        int n1=scan.nextInt();
        System.out.print("Enter 2nd Integer :");
        int n2=scan.nextInt();
        ArrayList<Integer> commonFactors = common_fac(n1,n2);
        for (int factor : commonFactors) {
            System.out.print(factor + " ");
        }
    }
}
