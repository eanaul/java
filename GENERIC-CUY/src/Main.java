class AllInOne<T>{
    private T manusia;

    protected void setManusia(T manusia){
        this.manusia = manusia;
    }

    protected T getManusia(){
        return manusia;
    }
}


public class Main {
    public static void main(String[] args) {

        AllInOne<String> name = new AllInOne<>();
        name.setManusia("Reyhan");
        System.out.println("Nama saya: " + name.getManusia());

        AllInOne<Integer> age = new AllInOne<>();
        age.setManusia(17);
        System.out.println("Umur: " + age.getManusia());

        AllInOne<Character> chara = new AllInOne<>();
        chara.setManusia('R');
        System.out.println("Nama saya berawalan " + chara.getManusia());

    }
}