package Array;

import java.util.Scanner;


public class smRepeatingEle {
    public static int smRepeatingele(int[] arr)
    {   int N=arr.length;
        for (int i = 0; i < N-1; i++) {
            if(arr[i]==arr[i+1])
            {
            return arr[i] ;
            }

         }
        return  -1;
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int N=scan.nextInt();
        int[] arr= new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(smRepeatingele(arr));
    }

}
