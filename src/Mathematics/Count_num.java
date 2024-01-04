package Mathematics;

import java.util.Scanner;

public class Count_num {

    static int count_n(int num){
        int count=0;
        while (num>0){
            num=num/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Enter the Number Which You want to count");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("All counted number is"+count_n(num));
    }
}
