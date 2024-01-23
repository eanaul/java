public class Main {
    enum Level{
        LOW,
        MEDIUM,
        HIGH,
        EXPERT
    }


    public static void main(String[] args) {
        Level dif = Level.EXPERT;

        switch (dif){
            case LOW:
                System.out.println("In low level\n");
                break;
            case MEDIUM:
                System.out.println("In medium level\n");
                break;
            case HIGH:
                System.out.println("In high level\n");
                break;
            case EXPERT:
                System.out.println("Pretty crazy, EXPERT LEVEEELLLLL\n");
                break;
        }

        for(Level myVar : Level.values()){
            System.out.println(myVar);
        }


    }
}