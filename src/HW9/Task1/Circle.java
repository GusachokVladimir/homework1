package HW9.Task1;

public class Circle extends Figure{

    public Circle(int x) {
        super(x); // радиус
    }

    @Override
    double getPerimeter() {
        return 2 * x * Math.PI;
    }

    @Override
    double getArea() {
        return Math.PI * x * x;
    }
}
