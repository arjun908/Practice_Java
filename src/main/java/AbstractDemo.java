abstract class Writer{
     abstract int  write(int y);
}

class Pen extends Writer{
     int write(int y){
        System.out.print("Price of Pen in USD $: ");
        return y+30;
    }
}
class Pencil extends  Writer{
    int write(int y){
        System.out.print("Price of Pen in USD $: ");
        return y+10;
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        Writer obj1=new Pen();
        System.out.println(obj1.write(10));
        Writer obj2=new Pencil();
        System.out.println(obj2.write(10));
    }
}
