package classes_and_objects.Aggregation_and_composition;

class Student{
    Brain brain;
    Heart heart;
    Bike bike;
    Book book;
    public Student(){
        this.heart=new Heart(1,60);
        this.brain=new Brain(1,"white");
    }
    void setBike(Bike bike){
        this.bike=bike;
    }
    void  setBook(Book book){
        this.book=book;
    }

}
class Heart{
    int weight;
    int bpm;

    public Heart(int weight,int bpm) {
        this.weight=weight;
        this.bpm=bpm;
    }
}

class Brain{
    int weight;
    String colour;

    public Brain(int weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }
}

class  Bike{
    String brand;
    int mileage;

    public Bike(String brand, int mileage) {
        this.brand = brand;
        this.mileage = mileage;
    }
}

class Book{
    String name;
    String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
}
public class StudentMain {
    public static void main(String[] args) {
        Student mystudent=new Student();
        Book book=new Book("Java","Somna");
        Bike bike=new Bike("Yahama",40);
        mystudent.setBike(bike);
        mystudent.setBook(book);
        System.out.println(mystudent.brain.weight);
        System.out.println(mystudent.brain.colour);
        System.out.println(mystudent.heart.weight);
        System.out.println(mystudent.heart.bpm);
        System.out.println(mystudent.bike.brand);
        System.out.println(mystudent.bike.mileage);
        System.out.println(mystudent.book.name);
        System.out.println(mystudent.book.author);
    }

}
