import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> reg = new ArrayList<String>();
        reg.add("Indonesia");
        reg.add("India");
        reg.add("Cameroon");
        reg.add("USA");
        reg.add("Sweden");

        Iterator<String> ite = reg.iterator();

        System.out.println(ite.next());

        while(ite.hasNext()){
            System.out.println(ite.next());
        }

    }
}