package HW9.Task1;

public class RightTriangle extends Figure{

    public RightTriangle(int x, int y) {
        super(x, y);
    }

    @Override
    double getPerimeter() {
        return Math.sqrt(x * x + y * y) + x + y;
    }

    @Override
    double getArea() {
        return (x + y) * 0.5;
    }
}
