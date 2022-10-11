package shapes;

public class Square extends Rectangle{

    public Square(double side){
        super(side,side);
    }
    //method to get perimeter of a square
    public static double getPerimeter(double side){
        return 4 * side;
    }

    //method to get area of a square
    public static double getArea(double side){
        return Math.pow(side, 2);
    }

}
