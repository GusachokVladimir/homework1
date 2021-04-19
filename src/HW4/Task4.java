package HW4;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int evenCount = 0;

        do {
            System.out.println("Введите число больше 3");
            n = scanner.nextInt();
        } while (n <= 3);

        int[] array = new int[n];


        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * (n + 1));
            System.out.print(array[i] + " ");
            if (array[i] % 2 == 0){
                evenCount++;
            }
        }
        System.out.println();

        int[] array2 = new int[evenCount];

        for (int i = 0; i < array.length; i++) {
            int j = 0;
            if (array[i] % 2 == 0){
                array2[j] = array[i];
                System.out.print(array2[j] + " ");
                j++;
            }
        }


    }
}
