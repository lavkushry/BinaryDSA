package OOP;
class Colllge{
    String College_n ="World College";
    String dept;
    public  Colllge(String dept){
        this.dept=dept;
    }

    public Colllge() {

    }
}

public class TestCollege {
    public static void main(String[] args) {
        Colllge cse = new Colllge("CSE");
        System.out.println(cse.College_n);
//        System.out.println(Colllge.);
    }
}
