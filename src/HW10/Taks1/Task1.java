package HW10.Taks1;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", 120, 40000);
        Car car2 = new Car("KIA", 100, 17000);
        Car car3 = new Car("Volvo", 140, 50000);

        try {
            car1.start();
        } catch (CarNotStartExc carNotStartExc) {
            carNotStartExc.printStackTrace();
        }

        try {
            car2.start();
        } catch (CarNotStartExc carNotStartExc) {
            carNotStartExc.printStackTrace();
        }

        try {
            car3.start();
        } catch (CarNotStartExc carNotStartExc) {
            carNotStartExc.printStackTrace();
        }

    }
}
