package Programming;

public class HCFways {
    static int gcd1(int a, int b)
    {
        while (a>0 && b>0){
            if(a>b){
                a=a%b;
            }else {
                b=b%a;
            }
        }
        if(a==0){
            return b;
        }
        return a;
    }

    static int gcd2(int a, int b)
    {
        while (a>0 && b>0){
            if (a>b){
                a=a-b;
            }else {
                b=b-a;
            }
        }
        if(a==0){
            return b;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 98, b = 56;
        System.out.println("GCD of " + a + " and " + b
                + " is " + gcd2(a, b));
    }
}
