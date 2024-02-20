import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//
//        List<Integer> squares = new ArrayList<>();
//
//        for(int number : numbers){
//            squares.add(number);
//        }
//
//        int sum = 0;
//        for(int square : squares){
//            sum += square;
//        }
//
//        System.out.println("Sum of Squares: " + sum);

//        ArrayList<String> cities = new ArrayList<>();
//
//        cities.add("Jakarta");
//        cities.add("Berlin");
//        cities.add("New York");
//        cities.add("Denver");
//
//        for (String city : cities){
//            System.out.println(city);
//        }

        LinkedList<String> states = new LinkedList<>();

        states.add("Denver");
        states.add("Milwaukee");
        states.add("Boston");
        states.add("New York");
        states.add("Seattle");

        for (String state : states){
            System.out.println(state);
        }

    }
}