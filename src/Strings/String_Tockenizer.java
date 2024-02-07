package Strings;

import java.util.StringTokenizer;

public class String_Tockenizer {
    public static void main(String[] args) {
        String s ="JAVA PYTHON SQLAI";
        StringTokenizer st = new StringTokenizer(s,"A");
        while (st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
    }
}
