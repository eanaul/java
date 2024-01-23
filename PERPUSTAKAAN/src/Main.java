import java.util.ArrayList;
import java.util.Scanner;

class Manga{
    private String judul;
    private int tahun;
    private String penulis;

    public Manga(String judul, int tahun, String penulis){
        this.judul = judul;
        this.tahun = tahun;
        this.penulis = penulis;
    }

    public String getJudul(){
        return judul;
    }

    public int getTahun(){
        return tahun;
    }

    public String getPenulis(){
        return penulis;
    }

    @Override
    public String toString(){
        return "Buku{" +
                "Judul='" + judul + '\'' +
                ", Penulis='" + penulis + '\'' +
                ", Tahun='" + tahun + '\''+
                '}';
    }
}

class Perpustakaan{
    private ArrayList<Manga> daftarManga = new ArrayList<>();

    public void tambahManga(Manga manga){
        daftarManga.add(manga);
    }

    public void tampilkanManga(){
        if(daftarManga.isEmpty()){
            System.out.println("Manga kosong.");
        }else{
            System.out.println("Daftar Manga: ");
            for (Manga manga : daftarManga){
                System.out.println(manga);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Perpustakaan perpus = new Perpustakaan();

//        tambah beberapa buku ke perpustakaan
        perpus.tambahManga(new Manga("One Piece", 1997, "Eiichiro Oda"));
        perpus.tambahManga(new Manga("Naruto", 2002, "Masashi Kishimoto"));

//        tampilkan buku
        perpus.tampilkanManga();

        System.out.println("Masukan daftar buku baru: ");
        System.out.print("Judul: ");
        String judul = input.nextLine();
        System.out.print("Penulis: ");
        String penulis = input.nextLine();
        System.out.print("Tahun: ");
        int tahun = input.nextInt();


        Manga mangaBaru = new Manga(judul, tahun, penulis);
        perpus.tambahManga(mangaBaru);
        perpus.tampilkanManga();
    }
}