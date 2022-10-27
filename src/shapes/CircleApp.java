package shapes;

public class CircleApp {

    private double radius;

    public CircleApp(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * (Math.pow(radius,2));

    }

    public double getCircumference(){
        return 2 * Math.PI * this.radius;

    }
}
