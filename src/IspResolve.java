interface TwoDimension {
   double area();
}
interface ThreeDimension {
    double area();
    double volume();
}
class Square implements TwoDimension {
    private double side;

    public Square(double s) {
        this.side = s;
    }

    @Override
    public double area() {
        return side * side;
    }
}
class Rectangle implements TwoDimension {
    private double length, width;

    public Rectangle(double l, double w) {
        this.length = l;
        this.width  = w;
    }

    @Override
    public double area() {
        return length * width;
    }
}
class Cube implements ThreeDimension {
    private double side;

    public Cube(double s) {
        this.side = s;
    }

    @Override
    public double area() {
        return 6 * side * side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }
}
public class IspResolve {
    public static void main(String[] args) {
        Square sq = new Square(20);
        Rectangle rc = new Rectangle(30, 50);
        Cube co = new Cube(10);
    }
}
