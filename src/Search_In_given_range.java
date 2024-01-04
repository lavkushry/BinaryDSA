public class Search_In_given_range {
    public static void main(String[] args) {
        //Q2 Search the target element in given array but in Specified range
        int[] arr={14,20,47,51,60,21,4,9};
        int target=14;
        System.out.println(linearSearch3(arr,target,1,6));
    }

    static boolean linearSearch3(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return false;
        }
        for(int index=start; index<end; index++){
            int ele=arr[index];
            if(ele==target){
                return true;
            }
        }
        return false;
    }
}
