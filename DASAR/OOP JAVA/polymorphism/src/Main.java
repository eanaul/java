class Animal{
    public void animalSound(){
        System.out.println("Animal can make a sound!");
    }
}

class Sheep extends Animal{
    public void animalSound(){
        System.out.println("Sheep goes baaaa");
    }
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("Dog goes bark bark");
    }
}

class Cow extends Animal{
    public void animalSound(){
        System.out.println("Cow goes moooooo");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal sheep = new Sheep();
        Animal dog = new Dog();
        Animal cow = new Cow();

        animal.animalSound();
        sheep.animalSound();
        dog.animalSound();
        cow.animalSound();
    }
}