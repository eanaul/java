class Country{
    protected String name;
    protected String sayHello;
}

class City extends Country{
    void setCountry(String setCountry)
    void setHello(String sayHello){
        this.sayHello = sayHello;
    }

    void getHello(){
        System.out.println(this.sayHello);
    }
}

public class Main {
    public static void main(String[] args) {

        City city1 = new City();
        city1.setHello("Bounjour");
        city1.getHello();
    }
}