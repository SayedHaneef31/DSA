package BitWise_11;

public class clearLast2Bits {
    public static void main(String[] args) {
        int n=10;
        int bitmask=~0<<2;
        System.out.println(n&bitmask );
    }
}
