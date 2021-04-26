package HW6;

public class MilitaryAir extends Air{
    private boolean ejectionSystem;
    private int numberMissiles;


    public MilitaryAir(int power, int maxSpeed, int mass, String makeAuto, int wingspan, int minLengthTakeoff,
                       boolean ejectionSystem, int numberMissiles) {
        super(power, maxSpeed, mass, makeAuto, wingspan, minLengthTakeoff);
        this.ejectionSystem = ejectionSystem;
        this.numberMissiles = numberMissiles;
    }

    public String getCharacteristics(){
        return super.getCharacteristics() + " Наличие системы катапультирования: " + ejectionSystem
                + " Количество ракет на борту: " + numberMissiles;
    }


    public void shoot(){
        if (numberMissiles > 0){
            numberMissiles--;
            System.out.println("Ракета пошла");
        }else System.out.println("Боеприпасы отсутствуют");
    }

    public void checkEjectionSystem(){
        if (ejectionSystem){
            System.out.println("Катапультирование прошло успешно");
        }else System.out.println("У Вас нет такой системы");
    }
}
