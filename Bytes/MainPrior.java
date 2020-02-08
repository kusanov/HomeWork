package Bytes;

public class MainPrior {
    public static void main(String[] args) {
      int b=2,c=8,b1=2,b2=2,b3=2,b4=2,c1=8,c2=8,c3=8;
      int  z1 = 5+2/8; // 5+0=5
        System.out.println(z1);
        int  z2 = (5 + 2)/8; // 7/8=0
        System.out.println(z2);
        int  z3 = (5 + b++) / c; // 7/8
        System.out.println(z3);
        int  z4 = (5 + b1++)/--c; // 7/7
        System.out.println(z4);
        c ++;
        int  z5 = (5 * 2 >> b2++)/ --c1;
         System.out.println(z5);
        int  z6 = (5 + 7 > 20 ? 68 : 22 *2  >> b3++)/--c2;
        System.out.println(z6);
        int  z7 = (5 + 7 > 20 ? 68  : 22 *2  >> b4++)/--c3;
        System.out.println(z7);
        boolean z8 = 6 - 2 > 3 && 12 * 12 <= 119;
        System.out.println(z8);
        boolean z9 = true && false;
        System.out.println(z9);
    }
}
