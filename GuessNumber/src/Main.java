import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int acak = random.nextInt(10) + 1;

        Scanner input = new Scanner(System.in);
        int nyawa = 3;
        while(nyawa != 0) {
            nyawa = nyawa - 1;
            System.out.print("Silahkan tebak angka: ");
            int tebak = input.nextInt();

            if (tebak == acak) {
                System.out.println("Anda benar!");
                System.out.println("Angka nya adalah " + acak);
                break;
            }else if (tebak < acak) {
                System.out.println("Lebih tinggi");
            } else {
                System.out.println("Lebih rendah");
            }

            if(nyawa > 0){
                System.out.println("Sisa nyawa anda untuk menjawab adalah " + nyawa + " kali lagi.");
            }else if(nyawa == 0){
                System.out.println("Nyawa anda untuk menjawab habis, permainan berakhir.");
                System.out.println("Angka nya adalah " + acak);
                break;
            }
            }
        }
    }
