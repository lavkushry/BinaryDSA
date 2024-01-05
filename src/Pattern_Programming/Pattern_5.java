package Pattern_Programming;
/*
01 02 03 04 05
02 04 06 08 10
03 06 09 12 15
04 08 12 16 20
05 10 15 20 25
*/
public class Pattern_5 {
    public static void main(String[] args) {
        int n=5;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                int count=i*j;
                if(count<10){
                    System.out.print(0);
                }
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
}
