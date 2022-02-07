package Lesson2;

public class Task1 {

    //static Task1 task1 = new Task1();
    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        System.out.println(isSumBetween10And20(a, b));
    }

    public static boolean isSumBetween10And20(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum <=20) {
            return true;
        } else {
            return false;
        }
    }

    /*public static void main(String[] args) {
        int a = 10;
        int b = 11;
    System.out.println(task1.isSumBetween10And20(a, b));
    }*/
}
