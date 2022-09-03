import commands.Command;
import entities.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

    private static boolean isExit = true;
    private static List<Animal> animals = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Введите команду: ADD/LIST/EXIT");
        while (isExit) {
            Scanner in = new Scanner(System.in);
            String strCommand = in.nextLine().trim().toLowerCase();
            Command command = Command.fromString(strCommand);
            switch (command) {
                case ADD -> add();
                case LIST -> list();
                case EXIT -> exit();
                default -> System.out.println("Нет операции");
            }
        }
    }

    private static void add () {
        System.out.println("Добавить");
    }

    private static void list () {
        System.out.println("Список животных");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    private static void exit() {
        isExit = false;
    }
}