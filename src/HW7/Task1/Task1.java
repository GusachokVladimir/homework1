package HW7.Task1;

public class Task1 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];

        animals[0] = new Cow("трава", "поле",18, 2);
        animals[1] = new Lion("мясо", "прерии", 15,60 );
        animals[2] = new Giraffe("растения", "саванна", 5,44);

        Trainer trainer = new Trainer();

        for (Animal animal: animals){
            trainer.train(animal);
        }
    }
}
