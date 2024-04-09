import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String ans;
        Scanner input = new Scanner(System.in);
        do {
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.println("This is IMT Calculator");
            System.out.print("Please input your weight: ");
            double weight = input.nextDouble();
            System.out.print("\nPlease input your height in meter: ");
            double height = input.nextDouble();

            input.nextLine();

            double imt = weight / (height * height);
            String hasilImt = df.format(imt);
            System.out.println("\nYour IMT is: " + hasilImt);

            if (imt < 18.5) {
                System.out.println("You are Underweight.");
            } else if (imt > 18.5 && imt < 24.99) {
                System.out.println("You are in Normal Range.");
            } else if (imt >= 25 && imt < 29.99) {
                System.out.println("You are in Overweight.");
            } else {
                System.out.println("You are obese, please call doctor immediately.");
            }

            System.out.println("Wanna try again?: y/n");
            ans = input.nextLine();
        } while (ans.equals("y"));
        input.close();
    }
}