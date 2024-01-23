import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> kota = new HashSet<String>();

        kota.add("Bandung");
        kota.add("Bogor");
        kota.add("Sukabumi");
        kota.add("Banyuwangi");
        kota.add("Jakarta");
        kota.add("Medan");

        System.out.println(kota.contains("Bogor") + "\n");

        for (String i : kota){
            System.out.println(i);
        }
    }
}