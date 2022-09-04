import commands.Command;
import entities.Animal;
import entities.AnimalType;
import factory.AnimalFactory;
import utils.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

    private static boolean isExit = true;
    private static List<Animal> animals = new ArrayList<>();

    public static void main(String[] args) {
        while (isExit) {
            System.out.println("Введите команду: ADD/LIST/EXIT");
            String strCommand = Utils.readStringToLowerCase();
            Command command = Command.fromString(strCommand);
            switch (command) {
                case ADD -> add();
                case LIST -> list();
                case EXIT -> exit();
                case DEFAULT -> System.out.println("Нет операции");
            }
        }
    }

    private static void add () {
        System.out.println("Добавить животное в список (cat, dog, duck)");

        AnimalFactory factory = AnimalFactory.getInstance();

        String animalTypeStr = Utils.readStringToLowerCase();
        AnimalType animalType = AnimalType.fromString(animalTypeStr);

        switch (animalType) {
            case CAT, DOG, DUCK -> {
                var animal = factory.getAnimal(animalType);
                animals.add(animal);
                animal.say();
                isExit = true;
                System.out.println("Животное добавлено!");
            }
            case DEFAULT -> System.out.println("Такое животное нельзя добавить");
        }
    }

    private static void list () {
        if(animals.isEmpty()) {
            System.out.println("Список животных пока пуст. Добавьте хотя бы одно животное:");
        } else {
            System.out.println("Список животных");
            for (Animal animal : animals) {
                System.out.println(animal);
            }
        }
    }

    private static void exit() {
        isExit = false;
        Utils.scanner.close();
        System.out.println("Вы вышли из программы!");
    }
}