package CodingChallangeTap;

public class Day8 {
    public static int sumOfArray(int arr[]){
        int sum=0;
        for (int i = 0; i <=arr.length; i++) {
            sum=sum+i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[]={1,6,3,5,7,8,2,23};
        System.out.print("Sum:"+sumOfArray(arr));
    }
}
