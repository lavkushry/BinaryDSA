import java.util.Arrays;

public class search_in_2D_Array_ls {
    public static void main(String[] args) {
        //Q4 Search the target element in given 2D array and return the index at ewhich element is found, i,e return value in the form of array
        int[][]arr ={
                {1,2,3},
                {8,9,10},
                {18,19,20}
        };
        int target=9;
        int[] ans=linearsearch5(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] linearsearch5(int[][] arr, int target){
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(arr[row][col]==target){
                    return new int[] {row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
