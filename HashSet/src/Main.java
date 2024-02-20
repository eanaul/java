import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();

        names.add("Walter");
        names.add("Skyler");
        names.add("Jesse");
        names.add("Saul");
        names.add("Mike");

//        for(String name : names){
//            System.out.println(name);
//        }

        names.forEach(System.out::println);
        Iterator<String> nameIterator = names.iterator();
        while (nameIterator.hasNext()){
            System.out.println(nameIterator.next());
        }


        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(2);
        numberList.add(1);

        System.out.println(numberList);

        Set<Integer> numberSet = new HashSet<>();
        numberSet.addAll(numberList);
        System.out.println(numberSet);

    }
}