package HW3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = 0;
        int correctAnswer = 25;

        do {
            System.out.println("Сколько будет 5*5?");
            answer = scanner.nextInt();
        } while (answer != correctAnswer);
        System.out.println("Молодец");
    }
}
