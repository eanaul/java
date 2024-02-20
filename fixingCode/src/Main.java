import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        // Mendeklarasikan ArrayList tanpa menggunakan generics
        ArrayList<Object> list = new ArrayList();

        // Menambahkan beberapa elemen ke dalam ArrayList
        list.add("Hello");
        list.add(123);

        // Mengambil elemen pertama dan mencoba mengkastnya ke String
        String str = (String) list.get(0);
        System.out.println("String: " + str);

        // Mengambil elemen kedua dan mencoba mengkastnya ke String
        Integer num = (Integer) list.get(1);
        System.out.println("Integer: " + num);
    }
}
