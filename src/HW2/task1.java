package HW2;

import java.io.IOException;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) throws IOException {
        double A;
        double B;
        double R;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значнеие A = ");
        A = scanner.nextDouble();
        System.out.print("Введите значнеие B = ");
        B = scanner.nextDouble();
        System.out.print("Введите значнеие R = ");
        R = scanner.nextDouble();


        double R2 = Math.sqrt(A * A + B * B)/2;
        if (R2 <= R){
            System.out.println("Картонка закрывает отверстие");
        } else System.out.println("Картонка не закрывает отверстие");

    }
}
