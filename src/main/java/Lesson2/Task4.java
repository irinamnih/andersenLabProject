package Lesson2;

public class Task4 {

    public static void main(String[] args) {

       printWordNTimes("Хоть бы успеть",4);
    }

    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
        System.out.println(word);
        }
    }
}


