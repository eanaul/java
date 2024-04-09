import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<Cat> optionalCat = findCatByName("Negev");

        if(optionalCat.isPresent()){
            System.out.println(optionalCat.get().getName());
        }
        else {
            System.out.println("there's no such thing");
        }
    }

    private static Optional<Cat> findCatByName(String name){
        Cat cat = new Cat(name, 3);
        return Optional.ofNullable(null);
    }
}

