package Pattern_Programming;

import java.io.FileOutputStream;
import java.util.Scanner;
class Demo {

        public static void main(String[] args) {
            int n=5;
            for (int i = 1; i <=n; i++) {
                int count=i*(i+1)/2;
                for (int j = 1; j <=i; j++) {
                    if(count<10) {
                        System.out.print(0);
                    }
                    System.out.print(count-- + " ");
                }

                System.out.println();

            }

        }




}
