package HW8;

import HW8.hands.IHand;
import HW8.head.IHead;
import HW8.legs.ILeg;

public class Robot implements IRobot{
    private IHead head;
    private IHand hand;
    private ILeg leg;

    public Robot(IHead head, IHand hand, ILeg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public Robot() {
    }

    public IHead getHead() {
        return head;
    }

    public void setHead(IHead head) {
        this.head = head;
    }

    public IHand getHand() {
        return hand;
    }

    public void setHand(IHand hand) {
        this.hand = hand;
    }

    public ILeg getLeg() {
        return leg;
    }

    public void setLeg(ILeg leg) {
        this.leg = leg;
    }



    @Override
    public void action() {
        hand.upHand();
        head.speak();
        leg.step();
    }

    @Override
    public int getPrice() {
        int price = hand.getPrice() + head.getPrice() + leg.getPrice();
        return price;
    }
}
