//INTERFACE SEGERATION PRINCIPLE ---> many client interface are better then one geeneral purpose interface \
//client should not be forced to implement methods
interface Shape {
    double area();
    double volume();  //2d shapes don't contain any volume
}

 class square implements Shape {
     protected int side;
    square(int side ) {
        this.side=side;
    }
    public double area()  {
System.out.println("this is the area of square ");
      return side*side;
    }
    public double volume() {
        System.out.println("2-d shapes don't contain volume");
        throw new UnsupportedOperationException();
    }
 }

 class rectangle implements Shape  {
    protected int Length;
    protected int Breadth;

    rectangle(int Length,int Breadth) {
        this.Length=Length;
        this.Breadth=Breadth;
    }
    public double area() {
        return Length*Breadth;
    }

    public double volume() {

        System.out.println("bitch 2d shapes dont have volume ");
        throw new UnsupportedOperationException();
    }
 }


public class Isp {
    public static void main(String[] args) {
        square sq =new square(20);
        sq.area();
        sq.volume();
        rectangle rc =new rectangle(5,10);
        rc.area();
//        rc.volume();
    }

      }


