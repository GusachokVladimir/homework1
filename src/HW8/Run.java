package HW8;

import HW8.hands.SamsungHand;
import HW8.hands.SonyHand;
import HW8.hands.ToshibaHand;
import HW8.head.SamsungHead;
import HW8.head.SonyHead;
import HW8.head.ToshibaHead;
import HW8.legs.SamsungLeg;
import HW8.legs.SonyLeg;
import HW8.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        Robot robot1 = new Robot(new SamsungHead(50), new SonyHand(40), new ToshibaLeg(20));
        Robot robot2 = new Robot(new SonyHead(60), new ToshibaHand(50), new SamsungLeg(40));
        Robot robot3 = new Robot(new ToshibaHead(80), new SamsungHand(30), new SonyLeg(10));

        robot1.action();
        System.out.println();
        robot2.action();
        System.out.println();
        robot3.action();
        System.out.println();

        int price1 = robot1.getPrice();
        int price2 = robot2.getPrice();
        int price3 = robot3.getPrice();

        if (price1 > price2){
            if (price1 > price3){
                System.out.println("Робот 1 самый дорогой");
            }else System.out.println("Робот 3 самый дорогой");
        }else if (price2 > price3){
            System.out.println("Робот 2 самый дорогой");
        }else System.out.println("Робот 3 самый дорогой");
    }
}
