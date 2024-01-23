import java.util.ArrayList;
import java.util.Scanner;

class Siswa{
    private String name;
    private String rayon;
    private int nis;

    Siswa(String name, String rayon, int nis){
        this.name = name;
        this.rayon = rayon;
        this.nis = nis;
    }

    public String getName(){
        return name;
    }

    public String getRayon(){
        return rayon;
    }

    public int getNis(){
        return nis;
    }

    public String toString() {
        return "Siswa{" +
                "Nama='" + name + '\'' +
                ", NIS=" + nis +
                ", Rayon='" + rayon + '\'' +
                '}';
    }
}

class DaftarSiswa{
    private ArrayList<Siswa> daftarSiswa = new ArrayList<>();

    public void tambahSiswa(Siswa siswa){
        daftarSiswa.add(siswa);
    }

    public void tampilkanSiswa(){
        if (daftarSiswa.isEmpty()){
            System.out.println("Gaada siswa yang terdaftar");
        }else{
            System.out.println("Daftar siswa: ");
            for(Siswa siswa : daftarSiswa){
                System.out.println(siswa);
            }
        }
    }
}



public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DaftarSiswa daftarSiswa = new DaftarSiswa();

        daftarSiswa.tambahSiswa(new Siswa("Reyhan", "Cicurug 6", 12209113));
        daftarSiswa.tambahSiswa(new Siswa("Aulia", "Sukabumi 6", 31190221));

        daftarSiswa.tampilkanSiswa();

        System.out.println("Daftar siswa: ");
        System.out.print("Masukan Nama: ");
        String name = input.nextLine();
        System.out.print("Rayon: ");
        String rayon = input.nextLine();
        System.out.print("NIS: ");
        int nis = input.nextInt();

        daftarSiswa.tambahSiswa(new Siswa(name, rayon, nis));

        daftarSiswa.tampilkanSiswa();

    }
}