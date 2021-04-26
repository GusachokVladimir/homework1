package HW6;

public class Transport {
    private int power;
    private int maxSpeed;
    private int mass;
    private String makeAuto;

    public Transport(int power, int maxSpeed, int mass, String makeAuto) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.mass = mass;
        this.makeAuto = makeAuto;
    }

    public String getCharacteristics(){
        int powerW = (int) (power * 0.74);
        return "Мощность (л.с): " + power + " , максимальная скорость (км/ч): " + maxSpeed + " , масса (кг): "
                + mass + " , марка авто: " + makeAuto + " , Мощность (кВ): " + powerW;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getMakeAuto() {
        return makeAuto;
    }
}
