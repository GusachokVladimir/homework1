package HW2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число = ");
        n = scanner.nextInt();

        String nDay;

        switch (n){
            case 1:
            case 8:
                nDay = "Понедельник";
                break;
            case 2:
            case 9:
                nDay = "Вторник";
                break;
            case 3:
            case 10:
                nDay = "Среда";
                break;
            case 4: nDay = "Четверг";
                break;
            case 5: nDay = "Пятница";
                break;
            case 6: nDay = "Суббота";
                break;
            case 7: nDay = "Воскресенье";
                break;
            default: nDay = "Введите число меньше 10";
                break;
        }
        System.out.println(nDay);

    }
}
