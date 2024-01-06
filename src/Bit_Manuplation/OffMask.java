package Bit_Manuplation;
// How to switch of any Particular bit
public class OffMask {
    public static void main(String[] args) {
        int n=36;
        int i=5;

        int offmask=~(1<<i);
        System.out.println(n&offmask);
    }
}
