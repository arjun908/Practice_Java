class Calculator{// super class Parent class base class

    public int add(int i, int j){
        return i+j;
    }

}

class Calcadvance extends Calculator{//subclass child class derived class
    public int sub(int i, int j){
        return i-j;
    }
}

class Calcadv extends Calcadvance{
    public int multi(int i,int j){
        return i*j;
    }
}


public class InheritanceDemo {
    public static void main(String[] args) {

        Calcadv c3=new Calcadv();
        int x= c3.add(5,5);
        int y=c3.sub(7,2);
        int z= c3.multi(4,5);

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }




}
