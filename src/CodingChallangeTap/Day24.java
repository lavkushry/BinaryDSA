package CodingChallangeTap;
public class Day24 {
    public static void mdVowel(String s){
        String nstr="";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)== 'a' || s.charAt(i)== 'A' || s.charAt(i)== 'e' ||
                    s.charAt(i)== 'E' || s.charAt(i)== 'i' || s.charAt(i)== 'I' ||
                    s.charAt(i)== 'o' || s.charAt(i)== 'O' || s.charAt(i)== 'u' ||
                    s.charAt(i)== 'U'){

                nstr=nstr+"#"+s.charAt(i);

            }else {
                nstr=nstr+s.charAt(i);
            }
        }
        System.out.println(nstr);
    }
    public static void main(String[] args) {
        String s="Tap Academy";
        mdVowel(s);

    }

}
