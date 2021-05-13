package HW10.Taks1;

public class Car {
    private String model;
    private int speed;
    private int price;

    public Car(String model, int speed, int price) {
        this.model = model;
        this.speed = speed;
        this.price = price;
    }

    public Car(){

    }

    public void start() throws CarNotStartExc{
        int randomNumber = (int) (Math.random() * 20 + 1);
        if (randomNumber % 2 != 0){
            System.out.println("Автомобиль " + getModel() + " завелся");
        }else {
            throw new CarNotStartExc("Автомобиль " + getModel() + " не завелся");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
