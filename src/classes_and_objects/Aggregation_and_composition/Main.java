package classes_and_objects.Aggregation_and_composition;
class Mobile{
    Charger charger;
    Os os;
    public  Mobile()
    {
        Os o=new Os("Android",512);

    }
    void setCharger(Charger charger){
        this.charger=charger;
    }
}
class Os
{
    String name;
    int size;
    public Os(String name, int size){
        this.name=name;
        this.size=size;
    }

}
class Charger
{
    String brand;
    int voltage;
    public Charger(String brand, int voltage){
        this.brand=brand;
        this.voltage=voltage;
    }

}
public class Main {
    public static void main(String[] args) {
        Mobile mymobile = new Mobile();
        Charger mycharger =new Charger("Apple",512);
        mymobile.setCharger(mycharger);
        System.out.println(mymobile.charger.brand);
        System.out.println(mymobile.charger.voltage);
    }
}
