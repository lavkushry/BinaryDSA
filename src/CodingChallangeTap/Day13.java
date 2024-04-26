package CodingChallangeTap;

public class Day13 {
    public static int findLargestRepeatingElement(int[] array) {
        int res=0;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]==array[j]){
                    res=array[i];
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 2, 3, 3, 5, 6,6};
        System.out.println(findLargestRepeatingElement(array));

    }
}
