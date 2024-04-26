package CodingChallangeTap;
public class Day14 {
    public static void main(String[] args) {

        int [] arr ={1, 1, 1, 2, 3, 3, 5, 5, 5, 6};
        int count =0;
        int t=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(t==arr[i]){
                count++;
            }else {
                System.out.println(t + "-" + count);
                t = arr[i];
                count = 1;
            }
        }
        System.out.println(t+ "-"+count);
    }
}
