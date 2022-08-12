
@FunctionalInterface
interface A3{

     void show();
}

public class AnonymousExample {
    public static void main(String[] args) {
        A3 obj= () -> System.out.println("I am best");//lambda expression
        obj.show();
    }
}
