package Pattern_Programming;

public class Pattern_20 {
    /*
    Program of
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
*/
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n ; i++) {
            for (int k = 1; k <=n-i ; k++) {
                System.out.print("  ");
            }
            int count=1;
            for (int j = 1; j <=(2*i) -1; j++) {
                if(j<i){
                    System.out.print(count++ +" ");
                }else{
                    System.out.print(count-- +" ");
                }
            }
            System.out.println();

        }
    }
}
