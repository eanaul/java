public class Dasar {
    public static void main(String[] args) {
        System.out.println("Java is still learned by Rey");
        System.out.println("keep on fighting rey!");
        System.out.println(3 * 5);

        // ini single line komen pada umumnya

        String x = "elon ";
        String z = "musk";
        System.out.println("All hail to mr. " + x + z);

        int y = 9;
        System.out.println(y + 1);

        int nomor;
        nomor = 9;
        System.out.println(nomor);

        nomor = 5;
        System.out.println(nomor);

        // disini untuk menggunakan const bisa diganti dengan final

        final String name = "Otong";
        System.out.println(name);

        // int myNum = 5;
        // float myFloatNum = 5.99f;
        // char myLetter = 'D';
        // boolean myBool = true;
        // String myText = "Hello";


        // ifelse

        String namee = "Ha";

        if (namee == "Hansen") {
            System.out.println("Hello lanjiao");
        } else if (namee == "Deyna") {
            System.out.println("Hello Deyna!");
        }else{
            System.out.println("Hello Guest!");
        }

    String city = "Hanasaku";
    String result = (city == "Hanasaku") ? "Why did i move here?" : "I guess it was the weather";
    System.out.println(result);

    int i = 0;
    do {
    System.out.println(i);
    i++;
    }
    while (i < 5);

    int j = 0;
    while (i < 5){
        System.out.println(j);
        j++;
    }

    String[] City = {"Jakarta", "New York", "Bandung", "Stockholm", "Tokyo"};
    int[][] num = { { 12, 9, 0 }, {6, 7, 9} };

    for (int coek = 0; coek < num.length; coek++) {
        for (int cuy = 0; cuy < num[coek].length; cuy++) {
            System.out.println(num[coek][cuy]);
        }
    }

    for (int r = 0; r < City.length; r++) {
        System.out.println(City[r]);
    }
}
}
