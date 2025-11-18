interface Swimmable{
    void swim();
    void stopSwimming();
}

interface Flyable{
    void fly();
    void stopFlying();
}

interface Living{
    default void live(){
        System.out.println("ALIVE ALIVE ALIVE");
    }
}

class Submarine implements Swimmable{
    boolean t = false;
    public void swim(){
        System.out.println("Submarine start swimming");
        t = true;
    }
    public void stopSwimming(){
        if (t){
            System.out.println("Submarine....stop swimming");
            t = false;
        }
        else{
            System.out.println("Submarine no swim");

        }


    }
}

class Duck implements Swimmable,Flyable,Living{
    boolean t = false;
    boolean f = false;
    public void swim(){
        t = true;
        System.out.println("Duck start swimming");
    }
    public void stopSwimming(){
        if (t){
            System.out.println("Duck....stop swimming???");
            t = false;
        }
        else{
            System.out.println("Duck no swim");

        }
    }
    public void fly(){
        System.out.println("Duck is flying !!!");
        f = true;
    }
    public void stopFlying(){
        if (f){
            System.out.println("Duck down...");
        }
        else{
            System.out.println("Duck no fly");
        }
    }
}

class Penguin implements Swimmable, Living {
    boolean t = false;
    public void swim(){
        System.out.println("Penguin start swimming");
        t = true;
    }
    public void stopSwimming(){
        if(t){
            System.out.println("Penguin....stop swimming??");
        }
        else{
            System.out.println("Penguin no swim");

        }
    }
}

public class InterfaceDemonstration{
    public static void main(String[] arg){
        Submarine sub = new Submarine();
        sub.swim();
        sub.stopSwimming();
        Duck duck = new Duck();
        duck.live();
        duck.fly();
        duck.swim();
        duck.stopFlying();
        duck.stopSwimming();
        Penguin penguin = new Penguin();
        penguin.live();
        penguin.swim();
        penguin.stopSwimming();
        Duck duck2 = new Duck();
        // if no swim
        duck2.stopSwimming();
        duck2.stopFlying();
    }
}
