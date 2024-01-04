package Recursion;

public class Check_Sorted_Array {
    public static boolean check_sorted(int[] a){
        if(a.length<=1){
            return true;
        }
        int smallinput[]=new int[a.length-1];
        for(int i=1; i< a.length; i++){
            smallinput[i-1]=a[i];
        }
        boolean smallAns=check_sorted(smallinput);
        if(!smallAns){
            return false;
        }
        if(a[0]<=a[1]){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int[] input={2,4,5,7,6};
        System.out.println(check_sorted(input));
    }
}
