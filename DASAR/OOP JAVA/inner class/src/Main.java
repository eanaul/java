class outerClass{
    int x = 10;

    class innerClass{
        public int myInnerMethod(){
            return x;
        }
        int y = 5;
    }
}

public class Main {
    public static void main(String[] args) {

        outerClass myOuter = new outerClass();
        outerClass.innerClass myInner = myOuter.new innerClass();
        System.out.println(myInner.myInnerMethod());

//        outerClass.innerClass myInner = new outerClass.innerClass();
//        System.out.println(myInner.y);


//        outerClass myOuter = new outerClass();
//        outerClass.innerClass myInner = myOuter.new innerClass();
//        System.out.println(myInner.y + myOuter.x);
    }
}