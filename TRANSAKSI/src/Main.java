import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Barang {
    private String nama;
    private int kode;
    private double harga;
    private int stok;

    public Barang(String nama, int kode, double harga, int stok) {
        this.nama = nama;
        this.kode = kode;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public int getKode() {
        return kode;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void kurangiStok(int jumlah) {
        if (jumlah > 0 && jumlah <= stok) {
            stok -= jumlah;
        } else {
            System.out.println("Stok tidak mencukupi.");
        }
    }

    @Override
    public String toString() {
        return "Barang{" +
                "Nama='" + nama + '\'' +
                ", Kode=" + kode +
                ", Harga=" + harga +
                ", Stok=" + stok +
                '}';
    }
}

class TokoElektronik {
    private ArrayList<Barang> daftarBarang = new ArrayList<>();
    private Map<Integer, Integer> transaksi = new HashMap<>();
    private int nomorTransaksi = 1;

    public void tambahBarang(Barang barang) {
        daftarBarang.add(barang);
    }

    public void tampilkanBarang() {
        if (daftarBarang.isEmpty()) {
            System.out.println("Inventaris toko kosong.");
        } else {
            System.out.println("Inventaris Toko:");
            for (Barang barang : daftarBarang) {
                System.out.println(barang);
            }
        }
    }

    public void lakukanTransaksi() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan kode barang yang ingin dibeli:");
        int kodeBarang = input.nextInt();

        Barang barangDibeli = cariBarang(kodeBarang);

        if (barangDibeli != null) {
            System.out.println("Masukkan jumlah yang ingin dibeli:");
            int jumlahBeli = input.nextInt();

            if (jumlahBeli > 0 && jumlahBeli <= barangDibeli.getStok()) {
                barangDibeli.kurangiStok(jumlahBeli);
                transaksi.put(nomorTransaksi++, kodeBarang);
                System.out.println("Transaksi berhasil!");
            } else {
                System.out.println("Jumlah pembelian tidak valid atau stok tidak mencukupi.");
            }
        } else {
            System.out.println("Barang dengan kode tersebut tidak ditemukan.");
        }
    }

    private Barang cariBarang(int kodeBarang) {
        for (Barang barang : daftarBarang) {
            if (barang.getKode() == kodeBarang) {
                return barang;
            }
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TokoElektronik tokoElektronik = new TokoElektronik();

        // Menambahkan beberapa barang ke inventaris
        tokoElektronik.tambahBarang(new Barang("Smartphone", 101, 1500.0, 10));
        tokoElektronik.tambahBarang(new Barang("Laptop", 102, 3000.0, 5));

        // Menampilkan daftar barang
        tokoElektronik.tampilkanBarang();

        // Melakukan transaksi
        tokoElektronik.lakukanTransaksi();

        // Menampilkan daftar barang setelah transaksi
        tokoElektronik.tampilkanBarang();
    }
}
