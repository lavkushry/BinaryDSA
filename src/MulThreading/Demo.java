package MulThreading;

class A extends Thread
{
    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class B extends Thread
{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {throw new RuntimeException(e);}
        }
    }
}
public class Demo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
//        b.setPriority(Thread.MAX_PRIORITY);


        a.start();
        b.start();
    }

}
