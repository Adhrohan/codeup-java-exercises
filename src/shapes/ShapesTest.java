package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        System.out.println(Rectangle.getPerimeter(5,4));
        System.out.println(Rectangle.getArea(5,4));

        Rectangle box2 = new Square(5);
        System.out.println(Square.getPerimeter(5));
        System.out.println(Square.getArea(5));

    }
}
