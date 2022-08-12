
@FunctionalInterface
interface Demo{
    int num=8;
    void abc();
    default void show1(){
        System.out.println("in demo");
        //in demo
    }

    static void show(){
        System.out.println("In show");
    }
}

interface Demo2{

    default void show1(){
        System.out.println("in demo2");
        //In demo2

    }
}

class DemoImpl implements Demo, Demo2{
    @Override
    public void abc() {
        System.out.println("Good day");
    }

    @Override
    public void show1() {
        Demo2.super.show1();
        System.out.println("in abc");
        //It is throwing error because we have declared variable in interface which makes it constant.
//my feature brach

    }
}


public class InterfaceDemo {
    public static void main(String[] args) {

        Demo.show();
        Demo obj1=new DemoImpl();
        obj1.abc();
        Demo2 obj2=new DemoImpl();
        obj2.show1();
    }
}
