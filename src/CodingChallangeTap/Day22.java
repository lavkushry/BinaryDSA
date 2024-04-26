package CodingChallangeTap;
public class Day22 {
    public static void removeSplC(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z' ||  s.charAt(i) >= 'a' && s.charAt(i)<='z'){
                ans+=s.charAt(i);
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
    String s="Hello@3232World";
    removeSplC(s);
    }
}
