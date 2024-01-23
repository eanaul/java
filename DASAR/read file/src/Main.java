import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        try{
//            File myObj = new File("cuy.txt");
//            Scanner myReader = new Scanner(myObj);
//            while(myReader.hasNext()){
//                String data = myReader.nextLine();
//                System.out.println(data);
//            }
//        }catch (FileNotFoundException e){
//            System.out.println("An error occured");
//            e.printStackTrace();
//        }

        File myObj = new File("cuy.txt");
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable: " + myObj.canRead());
            System.out.println("File size in bytes " + myObj.length());
        }else {
            System.out.println("file does not exists.");
        }
    }
}