package HW3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double rate = 0.17;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада");
        double sum = scanner.nextDouble();
        System.out.println("Введите количество месяцев");
        int months = scanner.nextInt();

        for (int i = 0; i < months; i++) {
            sum *= rate + 1;
        }
        System.out.println("Сумма вклада равна " + sum);
    }
}
