package CodingChallangeTap;
//Write a program that finds the largest element present in an array.
//
//Example:
//Array: [5, 10, 3, 8, 15]
//Largest Element: 15
public class Day9 {
    public static int largestele(int arr[]){
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={5, 10, 3, 8, 15};
        System.out.println(largestele(arr));
    }

}
