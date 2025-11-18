class Animal{
    String name;
    int height;
    int weight;
    String color;

    public Animal(String name,int height,int weight,String color){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.color = color;
    }

    public void makeSound(){
        System.out.println(name + " издает звук");
    }
    public void Sleep(){
        System.out.println(name + " спит");
    }
    public void Eat(){
        System.out.println(name + " ест");
    }
}

class Cow extends Animal{
    public Cow(String name,int  height,int weight,String color){
        super(name,height, weight,color);
    }
    public void makeSound() {
        System.out.println("МУУУ");
    }
}



class Cat extends Animal{
    public Cat(String name,int  height,int weight,String color){
        super(name,height, weight,color);
    }
    public void makeSound() {
        System.out.println("Мяу мяу");
    }
}

class Dog extends Animal{
    public Dog(String name,int  height,int weight,String color){
        super(name,height, weight,color);
    }
    public void makeSound() {
        System.out.println("Гав гав");
    }
}


public class lab9{
    public static void main(){
        Animal cow = new Cow("Милка", 2, 500 ," black and white");
        Animal dog = new Dog("Шарик", 2, 500 ," Brown");
        Animal cat = new Cat("Фрося", 2, 500 ," White");
        cow.makeSound();
        dog.makeSound();
        cat.makeSound();
    }
}
