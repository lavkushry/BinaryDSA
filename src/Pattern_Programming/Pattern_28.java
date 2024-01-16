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
        char ch='A';
        for (int i = 1; i <= n; i++) {
            if(i%2==0){
                char chRev=(char)(ch+i-1);
                for (int j = 1; j <=n ; j++) {
                    System.out.print(chRev--+" ");
                    ch++;
                }
            }else{
                for (int j = 1; j <=i; j++) {
                    System.out.print(ch++ +" ");
                }

            }
        System.out.println();
        }
    }
}
