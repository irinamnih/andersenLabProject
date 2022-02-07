package Lesson2;

public class Task8 {

    public static void main(String[] args) {
        int[][] array = new int[5][5];

        for (int i=0; i<array.length; i++){
            array[i][i] = 1;
            }
        for (int j=0; j< array.length; j++){
            array[j][array.length-j-1] = 1;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
