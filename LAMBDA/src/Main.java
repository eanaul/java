//class Cat implements Printable{
//    @Override
//    public void print() {
//        System.out.println("Mew");
//    }
//}



public class Main {
    public static void main(String[] args) {
//        Cat myCat = new Cat();
        Printable lambdaPrintable = (s) -> "Mew" + s;
        printThing(lambdaPrintable);



    }


    static void printThing(Printable thing){
        String result = thing.print("!");
        System.out.println(result);
    }
}