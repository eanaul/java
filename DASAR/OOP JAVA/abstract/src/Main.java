abstract class Animal{
    public abstract void animalSound();

    public void sleep(){
        System.out.println("zzzzzzz");
    }
}

class Sheep extends Animal{
    public void animalSound(){
        System.out.println("Sheep goes baa baaa");
    }
}

public class Main {
    public static void main(String[] args) {
        Sheep sheep = new Sheep();
        sheep.animalSound();
        sheep.sleep();
    }
}