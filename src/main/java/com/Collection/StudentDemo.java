package com.Collection;

import java.util.*;

class Student implements Comparable<Student>{
    int rno,marks;
    String name;

    public Student(int rno,int marks,String name){
        super();
        this.rno=rno;
        this.marks=marks;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rno=" + rno +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }

    public int compareTo(Student s){
        return name.length()>s.name.length()?1:-1;
    }
}

public class StudentDemo {

    public static void main(String[] args) {

        List<Student> students=new ArrayList<>();
        students.add(new Student(1,100,"Arjun"));
        students.add(new Student(2,90,"Rahul"));
        students.add(new Student(3,75,"Sumit"));
        Collections.sort(students,(i,j)->i.marks>j.marks?1:-1);//Comparator can override comparable.
        //So now after comparator o/p will come based on this.So if comparable is there we
        //can override with comparator.

        for(Student s:students){
            System.out.println(s);
        }
    }
}
