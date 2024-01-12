package Pattern_Programming;
/*
Pattern of this is
1 2 3 4 5
2       3
3    4
4 5
5
*/
public class Pattern_15 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n ; i++) {
            int count=i;
            for (int j = 1; j <=(n-i)+1 ; j++) {
                if(j==1 || j == (n-i)+1 || i==1){
                    System.out.print(count++ +" ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
