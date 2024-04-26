package DSA.Array;

public class reversal_an_array {
    public static void main(String[] args) {
        int[] arr={2,4,8,10,12,14};
        swapArray1(arr);
    }
    /// ------------- Approach1 ---------------
    static void swapArray1(int arr[])
    {
        int n= arr.length;
        for (int i = 0; i <n/2 ; i++) {
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        System.out.println("Reversed Array is :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
