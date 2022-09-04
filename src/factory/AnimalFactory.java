package factory;

import entities.*;
import utils.Utils;

import java.util.Objects;
import java.util.Scanner;

public class AnimalFactory {
    private static AnimalFactory instance;

    private AnimalFactory() {
    }
    public static AnimalFactory getInstance() {
        if(Objects.isNull(instance)) {
            instance = new AnimalFactory();
        }
        return instance;
    }

    public Animal getAnimal(AnimalType animalType) {
        return getAnimalWithProperties(animalType);
    }

    private Animal getAnimalWithProperties(AnimalType animalType) {

        System.out.println("Введите имя животного: ");
        String name = Utils.readString();
        System.out.println("Введите возраст животного: ");
        int age = Utils.readInt();
        System.out.println("Введите вес животного: ");
        int weight = Utils.readInt();
        System.out.println("Введите цвет животного: ");
        String color = Utils.readString();

        Animal animal = null;

        switch (animalType) {
            case CAT -> animal = new Cat(name, age, weight, color);
            case DOG -> animal = new Dog(name, age, weight, color);
            case DUCK -> animal = new Duck(name, age, weight, color);
        }
        return animal;
    }
}
