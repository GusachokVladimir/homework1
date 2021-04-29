package HW7.Task1;

public class Animal {
    private String food;
    private String location;
    protected String nameAnimal;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void eat(){
        System.out.println("покушал");
    }

    public void sleep(){
        System.out.println("поспал");
    }

    public void say(){
        System.out.println("поговорил");
    }


    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public String getNameAnimal() {
        return nameAnimal;
    }

}
