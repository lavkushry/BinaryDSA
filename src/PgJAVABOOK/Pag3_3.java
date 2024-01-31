package PgJAVABOOK;
class Room{
    float length;
    float breadth;
    void getdata(float a, float b)
    {
        length=a;
        breadth=b;
    }
}
public class Pag3_3 {
    public static void main(String[] args) {
        float area;
        Room rooml =new Room();//Object Created rooml
        rooml.getdata(14,10);
        area=rooml.length*  rooml.breadth;
        System.out.println("Area ="+area);
    }

}
