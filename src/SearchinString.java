import java.util.Arrays;

public class SearchinString {
    public static void main(String[] args) {
        //Q1: Find the character element in the String. if the finds the Target char it should return True
        String name="Samuel";
        char target='i';
       // System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(linearSearch2(name,target));
    }
    static boolean linearSearch2(String name, char target){
        if(name.length()==0){
            return false;
        }
        for(int index=0; index<name.length(); index++){
            if(name.charAt(index)==target){
                return true;
            }
        }
        return false;
    }
}
