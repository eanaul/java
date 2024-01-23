
class Buku {
    String judul;
    String penulis;

    Buku(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }

    void display() {
        System.out.println("\nJudul\t: " + this.judul);
        System.out.println("Penulis\t: " + this.penulis);
    }
}

public class Main {
    public static void main(String[] args) {

        Buku dataBuku1 = new Buku("One Piece", "Eiichiro Oda");
        dataBuku1.display();
    }
}