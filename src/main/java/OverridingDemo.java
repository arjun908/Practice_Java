class AA{
    int i;
    public void show(){
        System.out.println("in A");
    }
}

class BB extends AA{
    int j=8;
    @Override
    public void show(){
        super.i=8;
        System.out.println(super.i);
        super.show();
        System.out.println("in B");
    }
    public void config(){
        System.out.println("config");
    }
}

class CC extends AA{
    public void show(){
        System.out.println("in C");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        AA obj1=new BB();
        obj1.show();
        obj1=new CC();
        obj1.show();



    }
}
