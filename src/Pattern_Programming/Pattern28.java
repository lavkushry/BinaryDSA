package Pattern_Programming;

import java.util.Scanner;

public class Pattern28 {
    public static void main(String[] args) {
        int i, j, spc, rows, k, t = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Input number of rows: ");
        rows = input.nextInt();

        spc = rows + 4 - 1;

        for (i = 1; i <= rows; i++) {
            for (k = spc; k >= 1; k--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(t + " ");
                t++;
            }
            System.out.println();
            spc--;
        }

        input.close(); // Closing the Scanner object to prevent resource leak
    }
}