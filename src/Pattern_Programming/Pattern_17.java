package Pattern_Programming;
/*
Pattern Programming of
1
1 2 3
1 2 3 4 5
1 2 3 4 5 6 7
1 2 3 4 5 6 7 8 9

*/
public class Pattern_17 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n ; i++) {
//            int count=i;
            for (int j = 1; j <=(2*i)-1 ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
