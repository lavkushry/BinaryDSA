package Pattern_Programming;
/*
Pattern of
A
B C
D E F
G H I J
K L M N O
*/
public class Pattern_28 {
    public static void main(String[] args) {
        int n=5;
        char a='A';
        for (int i = 1; i <= n; i++) {
            for (int j =1 ; j <=i ; j++) {
                System.out.print(a+++ " ");
            }
            System.out.println();
        }
    }
}
