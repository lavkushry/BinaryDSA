public class find_min_in_array {
    public static void main(String[] args) {
        //Q3 Search the Minimum Num in the given Array
        int[] arr={ 10,5,0,-3,-7,41};
        System.out.println(linearSearch4(arr));

    }
    static int linearSearch4(int[] arr){
        int min=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
