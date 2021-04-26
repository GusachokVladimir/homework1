package HW6;

public class CargoGround extends Ground{
    private int capacity;

    public CargoGround(int power, int maxSpeed, int mass, String makeAuto, int numberWheels, int fuelUse, int capacity) {
        super(power, maxSpeed, mass, makeAuto, numberWheels, fuelUse);
        this.capacity = capacity;
    }

    public String getCharacteristics() {
        return super.getCharacteristics() + " Грузоподъемность (в тоннах): " + capacity;
    }

    public void checkCapacity(int weight){
        if (capacity >= weight){
            System.out.println("Грузовик загружен");
        }else System.out.println("Вам нужен грузовик побольше");
    }
}
