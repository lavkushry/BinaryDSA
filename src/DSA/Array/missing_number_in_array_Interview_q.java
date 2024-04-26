package DSA.Array;

public class missing_number_in_array_Interview_q {
    public static void main(String[] args) {
        int arr[]={1,2,4,7,6,5};
        int n=arr.length;

        int sum_natural_num=((n+1)*(n+2))/2;
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum=sum+arr[i];
        }
        int missing_num= sum_natural_num-sum;
        System.out.println("Missing Number is:"+ missing_num);
    }
}
