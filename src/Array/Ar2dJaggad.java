package Array;

import java.util.Scanner;

public class Ar2dJaggad {
    public static void main(String[] args) {
        int [][] a = new int [2][];
        a[0]=new int[2];
        a[1]=new int[5];
        Scanner scan= new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("Enter the age of Class "+i+" Student "+j+" :");
                a[i][j]=scan.nextInt();
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
