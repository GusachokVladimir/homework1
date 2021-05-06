package HW9.Task1;

public class Start {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Square square = new Square(6);
        RightTriangle rightTriangle = new RightTriangle(4,7);

        System.out.println("Площадь круга равна " + circle.getArea());
        System.out.println("Периметр круга равен " + circle.getPerimeter());
        System.out.println();
        System.out.println("Площадь квадрата равна " + square.getArea());
        System.out.println("Периметр квадрата равен " + square.getPerimeter());
        System.out.println();
        System.out.println("Площадь прямоугольного треугольника равна " + rightTriangle.getArea());
        System.out.println("Периметр прямоугольного треугольника равен " + rightTriangle.getPerimeter());
    }
}
