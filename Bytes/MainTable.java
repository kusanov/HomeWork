package Bytes;

public class MainTable {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            for (int j = 2; j < 10; j++) {

                System.out.printf(j + " X " + i + " = " + j * i + "\t");
            }
            System.out.printf("\n");
        }

        }
    }
