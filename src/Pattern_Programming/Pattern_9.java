package Pattern_Programming;
/*
*Print this pattern
 *
 **
 ***
 ****
 *****
 */
public class Pattern_9 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n ; i++) {

            //Print of Spaces
            for (int k = 1; k <=n-i ; k++) {
                System.out.print(" ");
            }
            //Print of Stars
            for (int j = 1; j<=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
            }


        }
    }
