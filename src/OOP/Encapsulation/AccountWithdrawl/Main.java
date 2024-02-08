package OOP.Encapsulation.AccountWithdrawl;

public class Main {
    public static void main(String[] args) {
       Account bobsAccount= new Account();
       bobsAccount.setCustomerName("Bob Bharti");
       bobsAccount.setCustomerEmail("bobbhaiyya@gmail.com");
       bobsAccount.setCustomerPhone("98374634728");
       bobsAccount.withdrawFunda(100.0);
       bobsAccount.depoitFunds(250);
       bobsAccount.withdrawFunda(50);
       bobsAccount.depoitFunds(100);
       bobsAccount.withdrawFunda(45);
       bobsAccount.withdrawFunda(53);
    }
}
