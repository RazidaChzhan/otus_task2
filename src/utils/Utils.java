package utils;

import java.util.Scanner;

public class Utils {
    public final static Scanner scanner = new Scanner(System.in);

    public static String readStringToLowerCase() {
        return readString().toLowerCase();
    }

    public static String readString() {
        return scanner.nextLine().trim();
    }

    public static int readInt() {
        while (!scanner.hasNextInt()) {
            System.out.println("Вы ввели не число. Введите число!");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
