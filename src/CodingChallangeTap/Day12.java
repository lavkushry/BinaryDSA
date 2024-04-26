package CodingChallangeTap;

public class Day12 {
    public static void pairdiff(int arr[], int n){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]-arr[j]==4)
                {
                    System.out.print("("+arr[i]+","+arr[j]+") ");
                }
            }

        }
    }
    public static void main(String[] args) {
    int arr[]={9, 5, 6, 1, 2};
    int diff=4;
    pairdiff(arr,diff);

    }
}
