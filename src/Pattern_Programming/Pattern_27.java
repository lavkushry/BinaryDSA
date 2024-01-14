package Pattern_Programming;
/*
A
A B
A B C
A B C D
A B C D E
*/
public class Pattern_27 {
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

