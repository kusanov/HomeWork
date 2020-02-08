package Bytes;

import java.util.Scanner;

public class MainName {

    public static void main(String[] args) {

        Scanner in2 = new Scanner(System.in);
        System.out.print("Введите Имя: ");
        String Name = in2.nextLine();

        switch (Name) {
            case "Вася":
                System.out.println("Привет!");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
        }
    }
}

