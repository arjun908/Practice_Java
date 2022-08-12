
@FunctionalInterface
interface Demo{
    int num=8;
    void abc();

    static void show(){
        System.out.println("In show");
    }
}

class DemoImpl implements Demo{

    @Override
    public void abc() {
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
    }
}
