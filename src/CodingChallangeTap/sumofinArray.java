package CodingChallangeTap;

import java.util.Scanner;

public class sumofinArray {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int size=scn.nextInt();
        int[] arr= new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=scn.nextInt();
        }

        int sum=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            sum=sum+arr[i];
        }

        for (int i = 0; i <size; i++) {
            if(max < arr[i])
            {
                max=arr[i];
            }
        }

        for (int i = 0; i <size; i++) {
            if(min > arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println("min is"+(sum-max));
        System.out.println("Max is is"+(sum-min));

    }
}
