class Calc{

    int num1;
    int num2;
    int result;

    public Calc(int num1,int num2){
        this.num1=num1;
        this.num2=num2;

    }

    public Calc(int n){
        num1=n;
        num2=n;
    }

    public Calc(double d){
        num1=(int)d;
    }
}

public class ObjectDemo {

    public static void main(String[] args) {

        Calc obj=new Calc(6,5);
        System.out.println(obj.num1);
        System.out.println(obj.num2);
    }


}
