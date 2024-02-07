package Array;

import java.util.Scanner;

public class Ar1 {
    public static void main(String[] args) {
        int [] [] a= new int[2][5];
        Scanner scan =new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("Enter the age if the class"+i+" Student"+ j);
                a[i][j]=scan.nextInt();
            }
        }

        // Printing the Array
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
