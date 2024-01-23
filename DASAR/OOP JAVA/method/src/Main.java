class Siswa {
    String name;
    int nis;

    Siswa(String inputName, int inputNis){
        name = inputName;
        nis = inputNis;
    }

//    method tanpa return dan tanpa parameter
    void show(){
        System.out.println("Nama : " + this.name);
        System.out.println("Nis : " + this.nis);
    }

//    method tanpa return dan dengan parameter
    void setName(String nama){
        this.name = nama;
    }

//    method dengan return dan tanpa parameter
    String getName(){
        return this.name;
    }

    // method dengan return dan dengan parameter
    String message(String message){
        return "Hello " + message + ", Nama saya " + this.name;
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Siswa s = new Siswa("ucup", 12209113);
//        method
        // s.show();
        // s.setName("otong");
        // s.show();
        // System.out.println(s.getName());
        System.out.println(s.message("Selamat pagi"));
    }
}