package HW3;

public class Task4 {
    public static void main(String[] args) {
        int min = 0;
        int max = 99;
        int sum = 0;

        for (int i = min; i <= max; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
    }
}
