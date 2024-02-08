package OOP.Constructor.Customer;

public class Customer {
    private String name;
    private double creditlimit;
    private String email;

    public Customer(String name, double creditlimit, String email) {
        this.name = name;
        this.creditlimit = creditlimit;
        this.email = email;
    }

    public Customer() {
        this("Lavkush","lavkroy@gmail.com");
    }

    public Customer(String name,String email) {
        this(name,1000,email);
    }

    public String getName() {
        return name;
    }

    public double getCreditlimit() {
        return creditlimit;
    }

    public String getEmail() {
        return email;
    }
}
