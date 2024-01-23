class Siswa {
    String name;
    int nis;
    String rayon;

    Siswa(String inputName, int inputNis, String inputRayon){
        name = inputName;
        nis = inputNis;
        rayon = inputRayon;
    }
}

public class Main {


    public static void main(String[] args) {
        System.out.println("Ini program rehan");

        Siswa siswa1 = new Siswa("Otong", 12209113, "Cicurug 6");
        System.out.println("Hello " + siswa1.name + " Nis kamu " + siswa1.nis + " Rayon " + siswa1.rayon);
    }
}