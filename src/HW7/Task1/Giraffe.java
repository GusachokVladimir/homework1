package HW7.Task1;

public class Giraffe extends Animal{
    private int neckLength;
    private int numSpots;

    public Giraffe(String food, String location, int neckLength, int numSpots) {
        super(food, location);
        this.neckLength = neckLength;
        this.numSpots = numSpots;
        nameAnimal = "Giraffe";
    }
}
