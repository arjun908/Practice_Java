import java.util.Scanner;

public class SelectionDemo {

    public static void main(String[] args) {


        for(char i=1;i<=4;i++){
            for(char j=1;j<=4;j++){
                if(i==1||j==1||i==4||j==4)
                    System.out.print("$ ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
