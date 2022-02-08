package Lesson2;

public class Task2 {

    public static void main(String[] args) {
        int a = -5;
        isPositiveOrNegative(a);
    }

        public static void isPositiveOrNegative(int a) {
        if (a>=0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

}
