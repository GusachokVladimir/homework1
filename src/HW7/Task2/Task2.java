package HW7.Task2;

public class Task2 {
    public static void main(String[] args) {

        Phone phone1 = new Phone("37515555", "nokia", 60);
        Phone phone2 = new Phone("2561681", "samsung", 60);
        Phone phone3 = new Phone("1684648", "iphone", 60);
        String[] numbers = {"37515555", "2561681", "1684648"};

        phone1.printProperties();
        phone1.receiveCall("Zina");
        System.out.println(phone1.getNumber());
        phone1.receiveCall("Zina", "37515555");
        phone1.sendMessage(numbers);
        System.out.println();

        phone2.printProperties();
        phone2.receiveCall("Petr");
        System.out.println(phone1.getNumber());
        phone2.receiveCall("Petr", "2561681");
        phone2.sendMessage(numbers);
        System.out.println();

        phone3.printProperties();
        phone3.receiveCall("Foma");
        System.out.println(phone1.getNumber());
        phone3.receiveCall("Foma", "1684648");
        phone3.sendMessage(numbers);

    }
}
