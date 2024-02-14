package classes_and_objects;

import java.util.Scanner;

class Plane{

    void takeOff(){
        System.out.println("plane is taking off");
    }
    void fly(){
        System.out.println("plane is flying");
    }
    void land(){
        System.out.println("plane is landing");
    }
}


class CargoPlane extends Plane{
    void takeOff(){
        System.out.println("Cargolane is taking off");
    }
    void fly(){
        System.out.println("Cargolane is flying");
    }
    void land(){
        System.out.println("Cargolane is landing");
    }
}
class PassengerPlane extends Plane{
    void takeOff(){
        System.out.println("PassengerPlane is taking off");
    }
    void fly(){
        System.out.println("PassengerPlane is flying");
    }
    void land(){
        System.out.println("PassengerPlane is landing");
    }
}
class FighterPlane extends Plane{
    void takeOff(){
        System.out.println("FighterPlane is taking off");
    }
    void fly(){
        System.out.println("FighterPlane is flying");
    }
    void land(){
        System.out.println("FighterPlane is landing");
    }
}
class Factory{
    static Plane geteplane(String choice){
        if(choice.equalsIgnoreCase("CargoPlane"))
        {
            return new CargoPlane();
        } else if (choice.equalsIgnoreCase("PassengerPlane"))
        {
            return new PassengerPlane();
        } else if (choice.equalsIgnoreCase("FighterPlane")) {
            return new FighterPlane();
        }else
        {
            return null;
        }

    }
}


public class polymorphism {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String choice = scan.next();
        Plane ref=Factory.geteplane(choice);
        ref.fly();
        ref.takeOff();
        ref.land();
    }

}
