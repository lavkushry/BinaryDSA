package CodingChallangeTap;

public class Day10 {
    public static int occurance(int arr[],int n)
    {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==n)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] ={1, 2, 3, 2, 2, 4, 5};
        int n=2;
        System.out.println(occurance(arr,n));
    }
}
