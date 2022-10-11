package shapes;

public class Rectangle {
    public static void main(String[] args) {
        System.out.println(getArea(5,7));
        System.out.println(getPerimeter(5,7));
    }

    protected double length;
    protected double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;

    }

    public static double  getArea(double length, double width){
        return  length  * width;
    }

    public static double getPerimeter(double length, double width){
        return 2 * length + 2 * width;
    }
}
