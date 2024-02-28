package ExceptionHandling;

import java.util.Scanner;
class InvalidUserDetail extends Exception
{
    @Override
    public String getMessage() {
        return "Incorrect Card Detail Please Try Again";
    }
}

class ATM
{
    int accNo=1234;
    int pin= 7739;
    int a;
    int b;

    void AcceptInput()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Account No :");
        a=scan.nextInt();
        System.out.print("Enter your Pin :");
        b=scan.nextInt();
    }
    void validate()throws Exception
    {
        if(accNo==a && pin==b){
            System.out.println("Withdraw the cash");
        }else {
            InvalidUserDetail iud = new InvalidUserDetail();
            System.out.println(iud.getMessage());
            throw iud;

        }
    }

}
class Bank
{
    void implement()  {
        ATM atm = new ATM();
        try {
            atm.AcceptInput();
            atm.validate();
        }catch (Exception e){
            try {
                atm.AcceptInput();
                atm.validate();
            }catch (Exception e1){
                try {
                    atm.AcceptInput();
                    atm.validate();
                }catch (Exception e2){
                    System.err.println("CARD BLOCKED");
                }
            }
        }


    }

}

public class ExATM {
    public static void main(String[] args) {
        Bank bn = new Bank();
        bn.implement();
    }

}
