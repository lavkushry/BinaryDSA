package Strings;

public class StrMethods {
    public static void main(String[] args) {
       StringBuilder s=new StringBuilder("Lavkush Kumar");
       StringBuilder s1=new StringBuilder("Lavkush Kumar");
        String m=new String("          Lavkush Kumar");
        String m1=new String("Lavkush Kumar");
       s.append(" Vill pain");
       System.out.println(m.trim());
//       System.out.println(s.charAt(9));
//       System.out.println(s);
    }
}
//When CompareTO using with String Builder with Same Thing the output will not Zero
// Concat is not Working with String Builder
// Contains is not working with String Builder
// endsWith is not working with String Builder
// equals() with same string with diff obj given false with Str builder true with Str Buffer
// index of working with Both
// Split not working with