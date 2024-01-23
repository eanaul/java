import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try{
            FileWriter myWriter = new FileWriter("cuy.txt");
            myWriter.write("java code may be lil tricky, but is fun enough!");
            myWriter.close();
            System.out.println("Succesfully wrote to the file.");
        }catch (IOException ex){
            System.out.println("An error occured");
            ex.printStackTrace();
        }
    }
}