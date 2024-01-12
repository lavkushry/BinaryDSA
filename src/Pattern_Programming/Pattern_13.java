package Pattern_Programming;
/*
Added Pattern is
    1
   2 2
  3   3
 4     4
5 5 5 5 5
*/
public class Pattern_13 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i ; k++) {
                if(k==i || i == n || k==1){
                    System.out.print(i+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
