interface Animal{
    public void animalSound();
}

interface Creature{
    public void move();
}

class Sheep implements Animal, Creature{
    public void animalSound(){
        System.out.println("BAAAAAAAAAA");
    }

    public void move(){
        System.out.println("swooosshhh!");
    }
}

public class Main {
    public static void main(String[] args) {
        Sheep s = new Sheep();
        s.animalSound();
        s.move();
    }
}