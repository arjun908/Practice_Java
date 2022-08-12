
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
        //It is throwing error because we have declared variable in interface which makes it constant.


    }
}


public class InterfaceDemo {
    public static void main(String[] args) {

        Demo.show();

    }
}
