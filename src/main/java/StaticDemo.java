class Emp{
    int eid;
    int salary;
    static String ceo;



    public Emp(){
        eid=1;
        salary=80000;
    }
    static{

        ceo="john";
        System.out.println("IN STATIC BLOCK");
    }

    public void show(){
        System.out.println(eid+"  "+salary+"  "+ceo);
    }
}



public class StaticDemo {

    public static void main(String[] args) {

        Emp arjun=new Emp();

        Emp naveen=new Emp();
        // to access static variable we don't need object instead can be called by class name

        arjun.show();
        naveen.show();
    }


}
