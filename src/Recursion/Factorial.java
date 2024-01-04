package Recursion;

public class Factorial {

    public static int fact(int n){
        if (n==0){
            return  1;
        }
        int small_ans=fact(n-1);
        return n*small_ans;
    }
    public static void main(String[] args) {
        int n=3;
        int ans=fact(n);
        System.out.println(ans);

    }
}
