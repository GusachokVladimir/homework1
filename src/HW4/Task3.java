package HW4;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите размерность массива");
        int n = scanner.nextInt();

        int[][] array = new int[n][n];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt();
                System.out.print(array[i][j] + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0){
                    System.out.print(0);
                } else System.out.print(1);
            }
        }

    }
}
