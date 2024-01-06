package Pattern_Programming.GFG;

public class GFG_01 {
    public static void main (String[] args) {
        int n = 7;
        int value=1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                int minValue = Math.min(i, j);

//                int value = n - minValue + 1;
                while (value<=n/2){
                    value = n - minValue + 1;
                    n--;
                }
                System.out.print(value);

            }
            System.out.println();
        }

    }
}
