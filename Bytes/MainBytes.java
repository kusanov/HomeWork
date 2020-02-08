package Bytes;

public class MainBytes {
    public static void main(String[] args) {
        int x = 42, y = 15;
        int a = -42, b = -15;
        System.out.println("x | y=" + (x | y));
        //00101010/00001111/00101111
        System.out.println("x & y=" + (x & y));
        //00101010/00001111/00001010
        System.out.println("x ^ y=" + (x ^ y));
        //00101010/00001111/00100101
        System.out.println("~x=" + (~x));
        //00101010/11010101
        System.out.println("~y=" + (~y));
        System.out.println("a | b=" + (a | b));
        System.out.println("a & b=" + (a & b));
        System.out.println("a ^ b=" + (a ^ b));
        System.out.println("~a=" + (~a));
        System.out.println("~b=" + (~b));
    }
}
