package Pattern_Programming.GFG;
/*
Pattern Programming of
1
4
1 1 1 1 1 1 1
1 2 2 2 2 2 1
1 2 3 3 3 2 1
1 2 3 4 3 2 1
1 2 3 3 3 2 1
1 2 2 2 2 2 1
1 1 1 1 1 1 1
*/

import java.util.Scanner;

public class GFG_01 {static void boxPattern(int n) {
    int ind = n * 2 - 1;
    int[][] mat = new int[ind][ind];
    int count = 1;

    int top = 0, left = 0;
    int right = ind - 1, down = ind - 1;

    while (count <= n) {
        // top row
        for (int i = left; i <= right; i++)
            mat[top][i] = count;
        // left column
        for (int j = top + 1; j <= down; j++)
            mat[j][left] = count;
        // right column
        for (int k = left + 1; k <= right; k++)
            mat[k][right] = count;
        // bottom row
        for (int l = top + 1; l <= down; l++)
            mat[down][l] = count;

        count++;
        top++;
        right--;
        left++;
        down--;
    }

    for (int i = 0; i < ind; i++) {
        for (int j = 0; j < ind; j++) {
            System.out.print(mat[i][j] + " ");
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 1; i <= T; i++) {
            int N = scanner.nextInt();
            boxPattern(N);
        }

        scanner.close();
    }

}
