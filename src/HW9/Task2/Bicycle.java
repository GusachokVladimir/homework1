package HW9.Task2;

public class Bicycle {
    public Wheels wheels;
    public Handlebar handlebar;
    public Pedals pedals;
    public Seat seat;
    public Chain chain;

    public Bicycle() {
        this.wheels = new Wheels();
        this.handlebar = new Handlebar();
        this.pedals = new Pedals();
        this.seat = new Seat();
        this.chain = new Chain();
    }

    void run(){
        wheels.spinWheel();
        handlebar.left();
        pedals.spinPedal();
        seat.voice();
        chain.tension();
    }

    class Wheels {
        int numberWheel = 2;

        public void spinWheel (){
            System.out.println(numberWheel + " колеса крутятся");
        }
    }

    class Handlebar {
        int numberHandlebar = 1;

        public void left (){
            System.out.println(numberHandlebar + " руль поворачивается влево");
        }
    }

    class Pedals {
        int numberPedal = 2;

        public void spinPedal (){
            System.out.println(numberPedal + " педали вертятся");
        }
    }

    class Seat{
        int numberSeat = 1;

        public void voice (){
            System.out.println(numberSeat + " потертое седло скрипит");
        }
    }

    class Chain{
        int numberChain = 1;

        public void tension (){
            System.out.println(numberChain + " цепь натягивается");
        }
    }
}
