package HW7.Task2;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number){
        System.out.println("Звонит " + name + " по телефону: " + number);
    }

    public String getNumber(){
        return number;
    }

    public void printProperties(){
        System.out.println("номер телефона: " + number + " , модель телефона: " + model
                + " , вес телефона: " + weight);
    }

    public void sendMessage(String[] numbers){
        for (String number: numbers){
            System.out.println("Сообщение отправлено на номер: " + number);
        }
    }
}
