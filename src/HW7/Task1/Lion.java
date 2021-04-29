package HW7.Task1;

public class Lion extends Animal{
    private int jumpLength;
    private int speed;

    public Lion(String food, String location, int jumpLength, int speed){
        super(food, location);
        this.jumpLength = jumpLength;
        this.speed = speed;
        nameAnimal = "Lion";
    }
}
