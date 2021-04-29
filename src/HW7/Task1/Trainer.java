package HW7.Task1;

public class Trainer{

    public void train(Animal animal){
        System.out.println(animal.nameAnimal + " ест " + animal.getFood() + " и живет в " + animal.getLocation());
    }
}
