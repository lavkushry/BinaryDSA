package Strings.StringChallange;

import java.util.Arrays;

public class CheckPanagram {
    public static void main(String[] args) {
        String str="The Quick Brown fox jumps over lazy Dog";
        str=str.replace(" ","");
        str=str.toLowerCase();
        char arr[]=str.toCharArray();
        int arr1[]=new int[26];
        for (int i=0; i<arr.length; i++)
        {
            arr1[arr[i]-97]++;
        }
//        System.out.println(arr1[2]);
        for (int i=0; i<arr1.length;i++){
            if(arr1[i] == 0){
                System.out.println("String in not pragram");
                break;
            }
            }
        System.out.println("String is pnagram");
        }
    }


