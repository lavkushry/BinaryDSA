package CodingChallangeTap;
public class Day25 {
    public static int findIndex(String s,char a){
        int index=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==a){
                index=i;
            }
        }
        return  index;
    }
    public static void main(String[] args) {
        String s="hello";
        char f='o';
        System.out.println(findIndex(s,f));

    }
}
