import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        Scanner userInput = new Scanner(System.in);

        int panjang, lebar, luas;

        System.out.println("Program Menghitung Luas Persegi Panjang");

        System.out.print("Panjang = ");
        panjang = userInput.nextInt();

        System.out.print("Lebar = ");
        lebar = userInput.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas = " + luas);

        
    }
}