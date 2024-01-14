package Pattern_Programming;
/*
Pattern of
01
03*02
06*05*04
10*09*08*07
15*14*13*12*11
*/
public class Pattern_25 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int count = i * (i + 1) / 2;
            for (int j = 1; j <= i; j++) {
                if (count < 10) {
                    System.out.print(0);
                }
                System.out.print(count-- + "");
                if (j<=i-1) {
                    System.out.print("*");
                }
            }

            System.out.println();

        }
    }
}
