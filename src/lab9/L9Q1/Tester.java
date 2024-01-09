package lab9.L9Q1;

public class Tester {
    public static void main(String[] args) {
        Shape shape = new Shape();

        Rectangle rectangle = new Rectangle(4, 5);
        rectangle.setName("Rectangle");
        shape.display(rectangle.getName(),rectangle.getPerimeter(), rectangle.getArea());
        System.out.println();

        Square square = new Square(5);
        square.setName("Square");
        shape.display(square.getName(),square.getPerimeter(), square.getArea());
        System.out.println();

        Circle circle = new Circle(10);
        circle.setName("Circle");
        shape.display(circle.getName(),circle.getPerimeter(), circle.getArea());
        System.out.println();
    }

}
