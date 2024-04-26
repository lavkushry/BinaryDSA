package CodingChallangeTap;

public class Day18 {
    public static void main(String[] args) {
        int k = 9;
        int arr[] = {1, 2, 3, 4, 5};
        int maxLen = 0;
        int start = -1, end = -1;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k && j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                    start = i;
                    end = j;
                }
            }
        }

        if (start != -1 && end != -1) {
            System.out.print("Largest Subarray with Sum " + k + ": [");
            for (int i = start; i <= end; i++) {
                System.out.print(arr[i]);
                if (i < end) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        } else {
            System.out.println("No subarray found with sum " + k);
        }
    }
}
