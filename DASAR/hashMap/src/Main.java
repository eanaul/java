import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

//        bikin object hash map capitalcities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

//        add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        System.out.println(capitalCities.get("England") + "\n");

        for(String i : capitalCities.keySet()){
            System.out.println("Key: " + i + ", Value: " + capitalCities.get(i));
        }
    }
}