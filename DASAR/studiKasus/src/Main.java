class Animal{
    String name;
    int age;
    String species;

}

class Cat extends Animal{
    Cat(String name, int age, String species){
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public void deskripsi(){
        System.out.println(this.name + " adalah kucing berjenis " + this.species + " yang udah berumur " + this.age + " tahun");
    }

    public void suara(){
        System.out.println("Meow meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat("Neko", 3, "Persian");
        myCat.deskripsi();
        myCat.suara();
    }
}