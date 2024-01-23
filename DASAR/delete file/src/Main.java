import java.io.File;

public class Main {
    public static void main(String[] args) {
        File myObj = new File("hello.txt");
        if(myObj.delete()){
            System.out.println("Deleted file: " + myObj.getName());
        }else{
            System.out.println("Failed to delete file!");
        }
    }
}