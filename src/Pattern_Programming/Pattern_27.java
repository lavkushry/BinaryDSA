package Pattern_Programming;

public class Pattern_27 {
    package Pattern_Programming;
    /*
    Patttern of
    A
    B B
    C C C
    D D D D
    E E E E E
    */
    public class Pattern_26 {
        public static void main(String[] args) {
            int n='E';
            for (char i = 'A'; i <= n; i++) {
                for (char j ='A' ; j <=i ; j++) {
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }
    }
}
