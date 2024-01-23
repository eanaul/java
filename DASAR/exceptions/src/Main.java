

public class Main {
    static void checkAge(int age){
        if (age < 18 ){
            throw new ArithmeticException("Access denied - you must be at least 18 years old");
        }else{
            System.out.println("Access granted - you are old enough");
        }
    }

    public static void main(String[] args) {
//        try{
//            int[] myNum = {10, 12, 9};
//            System.out.println(myNum[2]);
//        } catch (Exception e){
//            System.out.println("Something went wrong");
//        } finally {
//            System.out.println("The 'try ... catch' is finished.");
//        }

        checkAge(10);

    }
}