class A1{
    public final void show(){
        System.out.println("in a1");
    }
}

class A2 extends A1{
    public void show1(){
        System.out.println("in a2");
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        A1 obj1=new A2();
        obj1.show();
    }
}
