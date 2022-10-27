package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    //protected properties for length and width
    protected double length;
    protected double width;

    //constructor that accepts length and width and sets their properties.
    Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }

    public abstract double setLength(double newLength);
    public abstract double setWidth(double newWidth);


}
