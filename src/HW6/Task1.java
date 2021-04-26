package HW6;

public class Task1 {
    public static void main(String[] args) {

        LightGround audi = new LightGround(200,180,2000,"Audi",4,12,
                "sedan", 5);

        System.out.println(audi.getCharacteristics());
        audi.autoStatus(5);
        System.out.println();

        CargoGround scania = new CargoGround(500, 180,50000, "Scania", 18,
                20, 60);

        System.out.println(scania.getCharacteristics());
        scania.checkCapacity(61);
        System.out.println();

        CivilAir airbus = new CivilAir(500, 700,2500, "Airbus",50,3000,
                200, true);

        System.out.println(airbus.getCharacteristics());
        airbus.checkPassenger(400);
        System.out.println();

        MilitaryAir f15 = new MilitaryAir(400, 2500,400,"F15", 20, 1500,
                true,2);

        System.out.println(f15.getCharacteristics());
        f15.shoot();
        f15.shoot();
        f15.shoot();
    }
}
