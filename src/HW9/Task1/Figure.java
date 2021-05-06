package HW9.Task1;

public abstract class Figure {
    int x;
    int y;

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Figure(int x) {
        this.x = x;
    }

    abstract double getPerimeter();
    abstract double getArea();
}
