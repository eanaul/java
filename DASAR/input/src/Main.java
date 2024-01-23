import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Your age? ");
        int age = input.nextInt();

        System.out.println("\nHello " + name + ", you are " + age + " years old.");
    }
}