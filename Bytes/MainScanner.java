package Bytes;

import java.util.Scanner;

    public class MainScanner {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.print("Input a number: ");
            int num = in.nextInt();
            long pro=1;
            for (int i = 1; i <=num; i++) {
            pro=i*pro;
            }
            System.out.printf("Your number:" + pro);
            in.close();
        }
    }
