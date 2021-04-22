package HW5.Task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        PC computer = new PC("intel", 16, 2000);

        computer.printPC();

        Scanner scanner = new Scanner(System.in);
        int pcStatus;
        int pushPower = 3;

        for (int i = 0; i < pushPower; i++) {
            System.out.println("Введите число для включения ПК: 0 или 1");
            pcStatus = scanner.nextInt();

            computer.pcOn(pcStatus);
        }

        for (int i = 0; i < pushPower; i++) {
            System.out.println("Введите число для выключения ПК: 0 или 1");
            pcStatus = scanner.nextInt();

            computer.pcOff(pcStatus);
        }

    }

}
