package entities;

public class Animal {
    private String name;
    private int age;
    private int weight;
    private String color;

    public Animal() {
    }

    public Animal(String name, int age, int weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void say() {
        System.out.println("Я говорю");
    }
    public void go() {
        System.out.println("Я иду");
    }
    public void drink() {
        System.out.println("Я пью");
    }
    public void eat() {
        System.out.println("Я ем");
    }

//    "Привет! меня зовут name, мне age лет(/год/года), я вешу - weight кг, мой цвет - color,

    private String getPrefix(int age) {
        int ageLastNumber = age % 10;
        boolean exclusion = (age % 100 >= 11) && (age % 100 <= 14);
        String old = "";

        if (ageLastNumber == 1)
            old = "год";
        else if(ageLastNumber == 0 || ageLastNumber >= 5 && ageLastNumber <= 9)
            old = "лет";
        else if(ageLastNumber >= 2 && ageLastNumber <= 4)
            old = "года";
        if (exclusion)
            old = "лет";
        return old;
    }

    @Override
    public String toString() {

        String prefix = getPrefix(age);
        return "Привет! Меня зовут "+ name + ", мне " +
                age + " " + prefix + ", я вешу - " + weight + "кг, мой цвет - " + color;
    }
}