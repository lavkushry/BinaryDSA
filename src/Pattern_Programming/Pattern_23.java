package Pattern_Programming;
/*
new Pattern is
01
02 03
04 05 06
07 08 09 10
11 12 13 14 15
*/
public class Pattern_23 {
    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (count < 10) {
                    System.out.print(0);
                }
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}
