package HW5.Task4;

public class PC {
    private String cpu;
    private int ram;
    private int hdd;
    private boolean unbroken = true;

    public PC(String cpu, int ram, int hdd) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    public void pcOn(int number){
        int randomNumber = (int) (Math.random() * 2);
        if (unbroken && number == randomNumber){
            System.out.println("ПК включился");
        }else{
            System.out.println("ПК сгорел");
            unbroken = false;
        }
    }

    public void pcOff(int number){
        int randomNumber = (int) (Math.random() * 2);
        if (unbroken && number == randomNumber){
            System.out.println("ПК выключился");
        }else{
            System.out.println("ПК сгорел");
            unbroken = false;
        }
    }

    public void printPC() {
        System.out.println("тип пролцессора " + cpu);
        System.out.println("объем оперативной памяти " + ram + " гб");
        System.out.println("объем жесткого дискаа " + hdd + " гб");
    }

}