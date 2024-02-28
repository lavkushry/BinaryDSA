package OOP;

import java.sql.SQLOutput;

abstract class Bird {
    abstract void eat();
     abstract void fly();

}
abstract class Eagle extends Bird {
    @Override
    void fly() {
        System.out.println("Eagle is Flying in the Sky");
    }
}
class SerpentEagle extends Eagle{
    @Override
    void eat() {
        System.out.println("Serpent Eagle Eat Serpent");
    }
}
class GolderEagle extends  Eagle {
    @Override
    void eat() {
        System.out.println("Golden Eagle Eats Golden Biryani ");
    }
}
public class EagleM {
    public static void main(String[] args) {
        Eagle e= new GolderEagle();
        e.fly();
        e.eat();
    }

}
