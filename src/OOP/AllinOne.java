package OOP;

import java.util.Scanner;

abstract  class Shape
{
    float area;
    abstract void acceptInput();
    abstract float calcArea();
    public void dispInput(){
        System.out.println("Area is:"+ area);
    }

}
class Rectangle extends Shape {
    private  float length;
    private  float breadth;
    @Override
    void acceptInput(){
        System.out.println("Enter the Length and height");
        Scanner scan = new Scanner(System.in);
        length=scan.nextFloat();
        breadth=scan.nextFloat();
    }
    @Override
    float calcArea()
    {
        area = length *breadth ;
        return  area;
    }
}
class Circle extends Shape
{
    private  float radius;

    @Override
    void acceptInput(){
        System.out.println("Enter the radius");
        Scanner scan = new Scanner(System.in);
        radius=scan.nextFloat();
    }
    @Override
    float calcArea(){
        area= 3.14f * radius *radius;
        return area;
    }

}
class Square extends Shape
{
    private  float side;

    @Override
    void acceptInput(){
        System.out.println("Enter the Side");
        Scanner scan = new Scanner(System.in);
        side=scan.nextFloat();
    }
    @Override
    float calcArea(){
        area=side*side;
        return area;
    }

}
class  Factory
{
    static  Shape getshape(String choice){
        if(choice.equalsIgnoreCase("sqare"))
        {
            return new Square();
        } else if (choice.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (choice.equalsIgnoreCase("Circle")) {
            return new Circle();
        }else {
            return null;
        }
    }

}

public class AllinOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Choice");
        String choice = scan.next();
        Shape s=Factory.getshape(choice);
        s.acceptInput();
        s.calcArea();
        s.dispInput();
    }

}
