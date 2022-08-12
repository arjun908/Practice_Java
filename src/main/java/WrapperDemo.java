public class WrapperDemo {
    public static void main(String[] args) {

        int i=5;
        Integer ii= i;//AutounBoxing
        int j=ii.intValue();//Unboxing

        Integer x=i;//Autoboxing
        int k=x; //autounboxing

        String str="123";
        int n=Integer.parseInt(str);
      //  System.out.println((n));
        System.out.println(n);

        Float f=7.4f;

        System.out.println(j);
    }
}
