abstract class Animal {
    void sound() {
        System.out.println("all animal loves to make sound ");
    }

    abstract void eat();
}

class Dog extends Animal{

    void color() {
        System.out.println("dog can have multiple colors ");
    }
    void sound()  {
        System.out.println("the dog barks to make a sound ");
    }

//    @Override
    void eat() {
        System.out.println("the dog eats both vegetables as well as meat ");
    }
}

class cat extends Animal {
    void sound() {
    System.out.println("the cat loves to make meow meow sound ");
}
void eat() {
        System.out.println("cat are also both plant eaters as well as meat eaters  ");
}
}
public class AbstractClass {
public static void main(String[] args) {
    Animal a =new Dog();
    Dog d =new Dog();
    cat ca=new cat();

    d.sound();
    d.eat();
    d.color();

    ca.sound();
    ca.eat();
    a.eat();
    a.sound();
     }
}
