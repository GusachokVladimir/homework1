package HW7.Task1;

public class Cow extends Animal{
    private int milkYield;
    private int numHorn;

    public Cow(String food, String location, int milkYield, int numHorn){
        super(food, location);
        this.milkYield = milkYield;
        this.numHorn = numHorn;
        nameAnimal = "Cow";

    }

}
