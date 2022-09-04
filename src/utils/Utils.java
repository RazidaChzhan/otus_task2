package utils;

import java.util.Scanner;

public class Utils {

    static {
        scanner = new Scanner(System.in);
    }

    public final static Scanner scanner;

    public static String readStringToLowerCase() {
        return scanner.nextLine().trim().toLowerCase();
    }

    public static String readString() {
        return scanner.nextLine().trim();
    }

    public static int readInt() {
        int number;
        while (!scanner.hasNextInt()) {
            System.out.println("Вы ввели не число. Введите число!");
            scanner.next();
        }
        number = scanner.nextInt();
        return number;
    }
}
