package Array;

public class AngryProfessor {
    public static String angryProfessor(int k, int[] a) {
        // Write your code here
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>=0){
                count++;
            }
        }
        System.out.println(count);

        if(count>=k){
            return "Yes";
        }
        return "NO";
    }

    public static void main(String[] args) {
        int arr[]={-2,-1,0,1,2};
        int k=3;
        System.out.println(angryProfessor(k,arr));
    }
}
