package Pattern_Programming;
/*
Print This Pattern
*
* *
* * *
* * * *
* * * * *
*/
public class Pattern_6 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
