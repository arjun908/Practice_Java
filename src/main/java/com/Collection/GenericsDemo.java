package com.Collection;

import java.util.*;

public class GenericsDemo {

    public static void main(String[] args) {

        List<Integer> values=new ArrayList<>();//List is mutable and can be changes however way
        values.add(4);//so these values 4,6,Arjun,9 all are objects
        values.add(1);//Also this 6 is not int it is Integer of wrapper class
        values.add(9);
        values.add(7);
        values.add(2);
        Collections.sort(values);
        Collections.reverse(values);
        Collections.shuffle(values);

        for(Object o:values){
            System.out.println(o);
        }
    }
}
