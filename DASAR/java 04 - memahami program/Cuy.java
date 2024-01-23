import java.util.Scanner;

public class Cuy {
    public static void main(String[] args){
        // String i = "Rehan";
        // System.out.println("Nama saya" );

        Scanner inputName = new Scanner(System.in);
        System.out.println("Nama yang kamu input: ");
        String inputanName = inputName.next();
        System.out.println("Nama kamu: " + inputanName);
    }
}
