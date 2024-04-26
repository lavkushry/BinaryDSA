package CodingChallangeTap;
public class Day26 {
    public static int lastIndex(String s,char ch)
    {   int index=0;
        for (int i = 0; i <s.length(); i++) {
            if(s.charAt(i)==ch){
                index=i;
            }
        }
        return  index;
    }
    public static void main(String[] args) {
        String s="hello world";
        char c='o';
        System.out.println(lastIndex(s,c));

    }
}
