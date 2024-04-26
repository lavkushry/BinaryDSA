package Programming;

public class PrimeBtwTwoNum {
    public static boolean checkPrime(int i){
        for (int j = 2; j*j <=i ; j++) {
            if (i%j == 0){
               return  false;
            }
        }
        return true;
    }
    public static void printprime(int a, int b){

        for (int i = a; i <=b ; i++) {
            if (checkPrime(i)==true){
                System.out.print(i+" ");
            }
        }
    }
    public static void printNprime(int n)
    {
        int count=0;
        for (int i = 2; count<n ; i++) {
            if (checkPrime(i) == true){
                System.out.print(i+" ");
                count++;
            }
        }
    }

    public static void printAllMultiple(int n, int x)
    {
        for (int i = 1; i <x ; i++) {
            if(i*n<=x){
                System.out.println(i*n);
            }
        }
    }

    public static void printCommonMultiple(int a, int b, int x)
    {
        int count=1;
        for (int i = 1; count<=x; i++) {
            if(i%a==0 && i%b==0)
            {
                System.out.print(i+" ");
                count++;
            }
        }
    }

    public static void main(String[] args) {
    int a=2;
    int b=3;
    int x=5;
    printCommonMultiple(a,b,x);
    }
}
