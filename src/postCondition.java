class Car {
    protected int speed;

    Car(int speed) {
        speed=0;
    }
    //ON ACCELERATION SPEED WILL INCREASE
    public void accelerate() {
        System.out.println("applying acclerator of a car speed will increase ");
        speed=speed+20;
    }
    public  void brake () {
        speed=speed-20;
        System.out.println("after applying brakes to the car speed will decrease ");
    }

    // NOW THE CLASS THAT INHERITS SHOULD tighten THE CONDITION IT CAN NOT MAKE IT MORE LOSE


}

class Electric extends Car {
    protected int speed; //THIS IS CALLED SHADOWING
//    This hides the speed variable of Car.
//    Now Electric has its own speed field, and
//    you're no longer using the one from the superclass unless you explicitly refer to it via super.speed.
    private int charge;

     Electric(int speed,int charge) {
         super(speed);
         speed=0;
        charge=100;
    }
    public void accelerate() {
        speed = speed+20;
        charge =charge-10;
    }
    @Override

    public void brake() {
        System.out.println("aPplying brakes in electric car so speed must reduce and charge must increase");
//        speed = speed-20;
        //THIS WILL V
        speed =speed +20;
        charge = charge +10;
    }

}


public class postCondition {
    public static void main(String[] args) {
        Car el = new Car(20);
        Electric ec = new Electric(20,50);
        el.brake();
        el.accelerate();
    }
}
