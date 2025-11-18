abstract class Creature {
    String name = null;
    boolean isAlive = false;

    abstract void bear();
    abstract void die();

    void shoutName() {
        if (name == null) {
            System.out.println("ERROR");
        } else {
            System.out.println(name);
        }
    }
}

abstract class Animal extends Creature{

}

final class Dog extends Animal{
    void bear(){
        name = "Rex";
        isAlive = true;
        System.out.println("The dog " + name + " was born");
    }
    void die(){
        name = "Rex";
        isAlive = false;
        System.out.println("The dog " + name + " dead");
    }
    void bark(){
        System.out.println("AW AW AW");
    }
}

final class Human extends Animal {
    void bear() {
        name = "Max";
        isAlive = true;
        System.out.println("The human " + name + " was born");
    }

    void die() {
        name = "Max";
        isAlive = false;
        System.out.println("The human " + name + " dead");
    }
}

class Alien extends Creature {
    void bear() {
        name = "бзябзябзябзя";
        isAlive = true;
        System.out.println("The alien " + name + " was born");
    }

    void die() {
        name = "бзябзябзябзя";
        isAlive = false;
        System.out.println("The alien " + name + " dead");
    }
}
public class AbstractClassDemonstration{
    public static void main(String[] args) {
        Creature[] creatures = new Creature[3];
        creatures[0] = new Dog();
        creatures[1] = new Human();
        creatures[2] = new Alien();
        for(int i =0;i<creatures.length;i++){
            creatures[i].bear();
        }
        for(int i =0;i<creatures.length;i++){
            creatures[i].die();
        }
        for(int i =0;i<creatures.length;i++){
            creatures[i].shoutName();
        }
        Dog dog = new Dog();
        dog.bark();

    }
}
