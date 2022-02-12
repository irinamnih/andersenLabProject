package Lesson3;

public class Person {
    public String name;
    public String function;
    public String email;
    public String phone;
    public int salary;
    public int age;

    public Person (String name, String function, String email, String phone, int salary, int age) {
        this.name = name;
        this.function = function;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public static void info(Person person) {

        System.out.println("ФИО: " + person.name + "; Должность: " + person.function + "; email: " + person.email + "; Телефон: " + person.phone + "; Зарплата: " + person.salary + "; Возраст: " + person.age);
    }

    public static void main(String[] args) {

        Person[] personsArray = new Person[5];

        personsArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        personsArray[1] = new Person("Petrov Petya", "Engeneer", "ppetrov@gmail.com", "05678923", 20000, 35);
        personsArray[2] = new Person("Ivanov Ivan", "Head engeneer", "ivanov.com", "053587823", 50000, 50);
        personsArray[3] = new Person("Somi Olga", "Accountant", "osomi.com", "2940578343", 30000, 45);
        personsArray[4] = new Person("Kras Iryna", "Jr engeneer", "ikras.com", "049683823", 19000, 25);

        info(personsArray[1]);

        System.out.println();

        ageMoreThan40(personsArray);
    }

    public static void ageMoreThan40(Person[] person) {
        for(int i = 0; i< person.length; i++){
            if(person[i].age > 40){
                info(person[i]);
            }

        }
    }
}
