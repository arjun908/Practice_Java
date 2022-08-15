package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        List values = new ArrayList();//List is collection of objects
        values.add(4);//so these values 4,6,Arjun,9 all are objects
        values.add(6);//Also this 6 is not int it is Integer of wrapper class
        values.add(9);
        values.add(2, 7);
        values.add(0,"Arjun");//If we use generics<> then this line will throw error
        // since generics make any collection type specefic.

        for(Object o:values){
            System.out.println(o);
        }
    }
}
