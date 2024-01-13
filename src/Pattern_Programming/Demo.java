package Pattern_Programming;

import java.util.Scanner;
public class Demo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.nextLine();

        // Consume the remaining newline character after nextDouble()
//        scan.nextLine();  // Add this line to clear the newline character



        System.out.println("String: " +s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}