import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> city = new ArrayList<String>();
        city.add("Jakarta");
        city.add("Stockholm");
        city.add("Berlin");
        city.add("Bandung");
        System.out.println(city + "\n");

        System.out.println(city.get(1) + "\n");

        city.set(3, "Manhattan");

        System.out.println(city);

        System.out.println("\n");

//        for (int i = 0; i < city.size(); i++){
        for(String i : city){
            System.out.println(city.get(i));
        }

//        how to delete
//        city.remove(index)
//        city.clear();
    }
}