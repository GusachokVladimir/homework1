package HW9.Task1;

public class Square extends Figure{

    public Square(int x) {
        super(x);
    }

    @Override
    double getPerimeter() {
        return 4 * x;
    }

    @Override
    double getArea() {
        return x * x;
    }
}
