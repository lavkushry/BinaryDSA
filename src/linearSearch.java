public class linearSearch {
    public static void main(String[] args) {
        int [] nums={5,10,15,7,9,20,22};
        int target=7;
        int ans=linearSearchAlgo(nums,target);
        System.out.println(ans);
    }
    static int linearSearchAlgo(int[] nums,int target){
        if(nums.length==0){
            return -1;
        }
        for (int i=0; i<nums.length-1; i++){
            int ele=nums[i];
            if(ele==target){
                return i;
            }
        }
        return -1;
    }

}
