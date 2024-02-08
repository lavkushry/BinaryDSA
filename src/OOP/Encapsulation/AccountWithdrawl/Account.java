package OOP.Encapsulation.AccountWithdrawl;

public class Account {
    private  String number;
    private  double balance;
    private  String customerName;
    private String  customerEmail;
    private String  customerPhone;

    public void depoitFunds(double depositAmount){
        balance+=depositAmount;
        System.out.println("Deposit of $"+ depositAmount+" made. new balance is $ "+this.balance);
    }

    public  void  withdrawFunda(double withdrawalAmount)
    {
        if(balance-withdrawalAmount <0){
            System.out.println("insufficient Funds! you have only $"+balance+" in your account.");
        }else {
            balance -= withdrawalAmount;
            System.out.println("withdrwal of $"+withdrawalAmount+" processed, remaining balance = $"+balance);
        }
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
