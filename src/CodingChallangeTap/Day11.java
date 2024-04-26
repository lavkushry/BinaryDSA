package CodingChallangeTap;
//Question:
//Write a program that prints all the pairs in an array.
//
//        Example:
//Array: [1, 2, 3, 4, 5]
//Pairs: (1, 2), (1, 3), (1, 4), (1, 5), (2, 3), (2, 4), (2, 5), (3, 4), (3, 5), (4, 5)

public class Day11 {
    public static void pair(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("("+arr[i]+","+arr[j]+"), ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5};
        pair(arr);
    }
}
