package Lesson1;

public class HomeWorkApp {

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int value = 0;

        printThreeWords();

        checkSumSign(a, b);

        printColor(value);

        compareNumbers(a, b);
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(int a, int b) {
        if (a + b >= 0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
     }

     public static void printColor(int value) {
        if (value <= 0){
            System.out.println("Красный");
        } else if (value > 0 && value <= 100){
            System.out.println("Желтый");
        } else if (value > 100){
             System.out.println("Зеленый");
         }
     }

     public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
     }
}
