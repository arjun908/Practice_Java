//class Student{
//    int rollno;
//    String name;
//
//    public Student(int i, String name) {
//        rollno=i;
//        this.name=name;
//
//    }
//
//    public void studentDetails(){
//        System.out.print((rollno));
//        System.out.println(" "+ name);
//
//    }
//
//}

public class ArrayDemo {

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4};
        int b[] = {5, 6, 7, 8};
        int c[] = {9, 10, 11, 12};

        int d[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8}, {9, 10, 11, 12}};

        for(int i[]:d){
            for(int j:i)
            {
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}

