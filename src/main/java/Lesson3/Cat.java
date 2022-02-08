package Lesson3;

public class Cat {
    public String name;
    public String color;
    public int age;

    public void meow() {
        System.out.println(name + " мяукнул");
    }

    public void info() {
        System.out.println("Кота зовут " + name + " его возраст: " + age);
    }

    public static void main(String[] args) {

        Cat barsik = new Cat();

        barsik.name = "Барсик";
        barsik.color = "Белый";
        barsik.age = 5;

        barsik.meow();
        barsik.info();

        }
    }


