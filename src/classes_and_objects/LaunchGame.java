package classes_and_objects;
class BankAccount{
    //Private variable to store the balance
    private float bal;
    public void setBal(float x)
    {
        bal=x;
    }

    public float getBal() {
        return bal;
    }
}

public class LaunchGame {
    public static void main(String[] args) {
       BankAccount ba =new BankAccount();
       ba.setBal(100000);
        System.out.println(ba.getBal());
    }
}
