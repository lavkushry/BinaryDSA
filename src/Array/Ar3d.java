package Array;

import java.util.Scanner;

public class Ar3d {
    public static void main(String[] args) {
        int[][][] a = new int[2][5][2];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.print("Enter the age if the School " + i + " Class " + j+ " Student "+k);
                    a[i][j][k] = scan.nextInt();
                }
            }
        }

        // Printing the Array
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
