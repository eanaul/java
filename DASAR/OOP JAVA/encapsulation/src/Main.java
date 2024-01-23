class Band{
    private String name;
    private int year;

    void setBand(String name, int year){
        this.name = name;
        this.year = year;
    }

    String getBand(){
        return "This is " + this.name + ", Year created " + this.year;
    }
}


public class Main {
    public static void main(String[] args) {
        Band band1 = new Band();
        band1.setBand("Pink Floyd", 1968);
        System.out.println(band1.getBand());

//        band1.name = "Pink Floyd";
//        band1.year = 1968;
//
//        System.out.println("name: " + band1.name + ", year " + band1.year);

    }
}