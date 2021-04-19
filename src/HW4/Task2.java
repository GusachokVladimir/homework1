package HW4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int n = 5;
        int temp;
        boolean sorted = false;

        int[] array = new int[n];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
            System.out.print(array[i] + " ");
        }
        System.out.println();

        while (!sorted) {
            sorted = true;

            for (int i = 0; i < array.length -1; i++) {
                if (array[i] > array[i + 1]){
                    temp = array[i];
                    array[i] = array[i +1];
                    array[i +1] = temp;
                    sorted = false;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
