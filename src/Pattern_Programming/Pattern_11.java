package Pattern_Programming;
/*
Print This Pattern
* * * * *
* * * *
* * *
* *
*

*/
public class Pattern_11 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {

            //Print of Spaces
            for (int k = 1; k <= n - i+1; k++) {
                System.out.print("* ");
            }
            //Print of Stars
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
            System.out.println();
        }

    }
}

