package Pattern_Programming;
/*
Added pattern is
1
1 2
1   3
1     4
1 2 3 4 5
*/
public class Pattern_14 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n ; i++) {
            for (int k = 1; k <=i ; k++) {
                if(k==i || i == n || k==1){
                    System.out.print(k+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
