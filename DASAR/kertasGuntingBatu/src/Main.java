import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String ulang;
        do {
            System.out.println("Ini adalah permainan Kertas Gunting Batu!\n");


            System.out.println("Silahkan pilih Kertas(1) / Gunting(2) / Batu(3) / Keluar(0)");
            int user = input.nextInt();

            if (user == 0) {
                System.out.println("Terimakasih sudah bermain!");
            }

            if (user < 1 || user > 3) {
                System.out.println("Pilihan yang kamu pilih tidak valid!");
            }

            int com = (int) (Math.random() * 3) + 1;

            System.out.println("Pilihan Komputer : " + convertToChoiceString(com));
            System.out.println("Pilihan User : " + convertToChoiceString(user));

            hasil(user, com);

            System.out.println("Ingin main lagi? (y/n)");
            ulang = input.next();
        }while(ulang.equalsIgnoreCase("y"));
    }

    private static void hasil(int user, int com){
        if (user == com){
            System.out.println("Hasil seri!");
        }else if(user == 1 && com == 3 || user == 2 && com == 1 || user == 3 && com == 2){
            System.out.println("Anda yang menang");
        }else{
            System.out.println("Anda kalah!");
        }
    }

    private static String convertToChoiceString(int choice){
        switch (choice){
            case 1:
                return "Kertas";
            case 2:
                return "Gunting";
            case 3:
                return "Batu";
            default:
                return "Pilihan tidak valid!";
        }
    }
}