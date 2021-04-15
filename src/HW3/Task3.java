package HW3;

public class Task3 {
    public static void main(String[] args) {
        int amoeba = 1;
        int hours = 0;
        int deltaHours = 3;

        while (hours <= 24){
            amoeba *= 2;
            hours += deltaHours;
        }
        System.out.println("количество амеб = " + amoeba);
    }
}
