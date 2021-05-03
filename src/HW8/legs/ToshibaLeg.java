package HW8.legs;

public class ToshibaLeg implements ILeg{
    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg(){

    }

    @Override
    public void step() {
        System.out.println("Шагнула нога Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
