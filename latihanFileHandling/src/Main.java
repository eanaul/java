import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            File file = new File("r.txt");
            if(file.createNewFile()){
                System.out.println("File berhasil dibuat");
            }else{
                System.out.println("File sudah ada");
            }
        }catch (IOException e){
            e.printStackTrace();
        }



        try(BufferedWriter bufferW = new BufferedWriter(new FileWriter("uhuy.txt"))){

            System.out.print("Apa yang km ingin isi kedalam file? ");
            String isi = scan.nextLine();
            bufferW.write(isi);
            System.out.println("isi file sudah terubah");
        }catch (IOException e){
            e.printStackTrace();
        }

        try(BufferedReader bufferR = new BufferedReader(new FileReader("uhuy.txt"))){
            String line;
            while ((line = bufferR.readLine()) != null){
                System.out.println("Read from file: " + line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}