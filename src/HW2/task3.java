package HW2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        int num1;
        int num2;
        int num3;
        int num4;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 1-е число = ");
        num1 = scanner.nextInt();
        System.out.print("Введите 2-е число = ");
        num2 = scanner.nextInt();
        System.out.print("Введите 3-е число = ");
        num3 = scanner.nextInt();
        System.out.print("Введите 4-е число = ");
        num4 = scanner.nextInt();

        int minNum = Math.min(Math.min(num1,num2), Math.min(num3,num4));
        System.out.println("Минимальное число = " + minNum);


    }
}
