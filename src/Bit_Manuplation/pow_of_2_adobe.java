package Bit_Manuplation;

public class pow_of_2_adobe {
    static void find_pow(String binaryNumber)
    {
        int count=0;
        int len=binaryNumber.length();
        for (int i =len-1; i >=0 ; i--) {
            if (binaryNumber.charAt(i) == '1')
            {
                break;
            }else{
                count++;
            }

        }
        int res=1;
        for (int i = 1; i <count-1 ; i++) {
            res=res*count;
        }
        System.out.println(res);

    }
    public static void main(String[] args) {
        String binaryNumber="001000000000";
        find_pow(binaryNumber);


    }
}
