package HW6;

public class LightGround extends Ground {
    private String bodyType;
    private int passengers;

    public LightGround(int power, int maxSpeed, int mass, String makeAuto, int numberWheels, int fuelUse, String bodyType,
                       int passengers) {
        super(power, maxSpeed, mass, makeAuto, numberWheels, fuelUse);
        this.bodyType = bodyType;
        this.passengers = passengers;
    }

    public String getCharacteristics(){
        return super.getCharacteristics() + " Тип кузова: " + bodyType + " Количество пассажиров: " + passengers;
    }

    public void autoStatus(int time){
        int distance = time * getMaxSpeed();
        double fuelUsage = fuelUseFor(distance);
        System.out.println("За время " + time + " ч, автомобиль " + getMakeAuto() + ", двигаясь с максимальной скоростью "
                + getMaxSpeed() + " км/ч проедет " + distance + " км и израсходует " + fuelUsage + " литров топлива.");
    }

    private double fuelUseFor(double distance){
        return getFuelUse() * distance / 100;
    }



}
