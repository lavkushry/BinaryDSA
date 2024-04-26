package CodingChallangeTap;

import java.util.Scanner;
public class Day17 {
    public static void main(String[] args) {
        int n = 10;
        int arr[] = {5, 2, 3, 4, 1};
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum == n) {
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + " ");
                    }

                    System.out.println();
                }
            }
        }
    }
}
