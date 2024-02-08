package OOP.Encapsulation.AccountWithdrawl;

public class Main {
    public static void main(String[] args) {
       Account bobsAccount= new Account();
       bobsAccount.withdrawFunda(100.0);
       bobsAccount.depoitFunds(250);
       bobsAccount.withdrawFunda(50);
       bobsAccount.depoitFunds(100);
       bobsAccount.withdrawFunda(45);
       bobsAccount.withdrawFunda(53);
    }
}
