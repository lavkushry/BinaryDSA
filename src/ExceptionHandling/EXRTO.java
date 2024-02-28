package ExceptionHandling;

import java.util.Scanner;

class UnderAgeException extends Exception
{
    @Override
    public String getMessage() {
        return "You're too young. !Please Wait";
    }
}
class OverAgeException extends Exception
{
    @Override
    public String getMessage() {
        return "You're too old. !Please Wait";
    }
}
class Karamchari
{
    int age;
    int a;
    
    void  acceptInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Age:");
        age=scan.nextInt();
    }
    void validate()throws Exception{
        if(age>=18){
            System.out.println("No! Problem you're Eligible");
        } else if (age>60) {
           OverAgeException oe= new OverAgeException();
           System.out.println(oe.getMessage());
           throw oe;
        }
        else {
          UnderAgeException ue= new UnderAgeException();
            System.out.println(ue.getMessage());
            throw ue;
        }
    }
}

class RTO
{
    void Implement(){
        Karamchari km = new Karamchari();
        try{
            km.acceptInput();
            km.validate();
        }catch (Exception e)
        {
            System.err.println("You're Not Eligible");
        }
    }

}

public class EXRTO {
    public static void main(String[] args) {
        RTO rto = new RTO();
        rto.Implement();

    }
}
