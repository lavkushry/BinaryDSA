package PgJAVABOOK;

public class Pag3_5 {
    //command Line test
    public static void main(String[] args) {
        int count,i=0;
        String string;
        count =args.length;
        System.out.println("Number of Arguments ="+count);
        while (i<count){
            string = args[i];
            i++;
            System.out.println(i+":"+"Java is"+string+"!");
        }
    }
}
