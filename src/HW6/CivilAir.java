package HW6;

public class CivilAir extends Air{
    private int passenger;
    private boolean businessClass;

    public CivilAir(int power, int maxSpeed, int mass, String makeAuto, int wingspan, int minLengthTakeoff, int passenger,
                    boolean businessClass) {
        super(power, maxSpeed, mass, makeAuto, wingspan, minLengthTakeoff);
        this.passenger = passenger;
        this.businessClass = businessClass;
    }

    public String getCharacteristics(){
        return super.getCharacteristics() + " Количество пассажиров: " + passenger + " Наличие бизнес-класс: " + businessClass;
    }

    public void checkPassenger(int count){
        if (passenger >= count){
            System.out.println("Самолет загружен");
        }else System.out.println("Вам нужен самолет побольше");
    }
}
