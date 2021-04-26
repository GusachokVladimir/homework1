package HW6;

public class Air extends Transport{
    private int wingspan;
    private int minLengthTakeoff;

    public Air(int power, int maxSpeed, int mass, String makeAuto, int wingspan, int minLengthTakeoff) {
        super(power, maxSpeed, mass, makeAuto);
        this.wingspan = wingspan;
        this.minLengthTakeoff = minLengthTakeoff;
    }

    public String getCharacteristics(){
        return super.getCharacteristics() + " Размах крыльев (в метрах): " + wingspan +
                " Минимальная длина взлетно-посадочной полосы для взлета: " + minLengthTakeoff;
    }
}
