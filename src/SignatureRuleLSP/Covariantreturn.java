package SignatureRuleLSP;

class Vehicle {
    String engine() {
        System.out.println("the engine starts with vrooooom sound");
        return this.toString();
    }
}
class Fourwheeler extends Vehicle {

    String engine() {
        System.out.println("the four wheeler  engine stars with vrr vrr vrrrrom ");
        return this.toString();
    }
}
class car extends Fourwheeler {
    @Override
    String engine() {
        System.out.println("the car engine starts with a different siound then all other engines of four wheelers ");
        return this.toString();
    }

}
class electriccar extends car  {
    @Override
  String engine() {
      System.out.println("well electric vehicle creates no sound ");

      return this.toString();
  }
}
//EACH CLASS THAT IS MOVING DOWN IN HIERARCHY IS MAKING THE METHOD MORE SPECIFIC

public class Covariantreturn {
    public static void main(String args[]) {
        Vehicle v1 =new Vehicle();
        v1.engine();
        Fourwheeler f4 =new Fourwheeler();
        f4.engine();
        car c1 =new car();
        c1.engine();
        electriccar ec =new electriccar();
        ec.engine();
        System.out.println("return " +ec.getClass().getSimpleName());
    }
}
