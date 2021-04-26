package HW6;

public class Ground extends Transport{
    private int numberWheels;
    private int fuelUse;

    public Ground(int power, int maxSpeed, int mass, String makeAuto, int numberWheels, int fuelUse) {
        super(power, maxSpeed, mass, makeAuto);
        this.numberWheels = numberWheels;
        this.fuelUse = fuelUse;
    }

    public String getCharacteristics(){
        return super.getCharacteristics() + " количество колес: " + numberWheels + " расход топлива (литр/100км): "
                + fuelUse;
    }

    public int getFuelUse() {
        return fuelUse;
    }
}
