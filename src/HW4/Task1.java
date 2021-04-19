package HW4;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {-10, -5, 1, 5, 10};
        int sum = 0;
        int multiplication = 1;
        int indexMin = 0;
        int indexMax = 0;
        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0){
                sum += array[i];
            }
        }
        System.out.println("сумма отрицательных элементов = " + sum);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
                indexMax = i;
            }
            if (array[i] < min){
                min = array[i];
                indexMin = i;
            }
        }
        for (int i = indexMin + 1; i < indexMax; i++) {
            multiplication *= array[i];
        }
        System.out.println("произведение элементов массива расположенных между максимальным и минимальным элементами = " + multiplication);







    }
}
