package SignatureRuleLSP;



class Animal {
    String sound;

    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}
class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}
public class Methodrule {
public static void main(String[] args) {
   Dog d1 =new Dog();

    String sound1 = d1.sound;
    d1.makeSound();
}

}
