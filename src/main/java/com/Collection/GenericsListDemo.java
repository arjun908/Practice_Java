package com.Collection;

import java.util.*;

public class GenericsListDemo {

    public static void main(String[] args) {

        List<Integer> values=new ArrayList<>();//List is mutable and can be changes however way
        values.add(404);
        values.add(908);
        values.add(639);
        values.add(265);
        values.add(392);
        //Sorting these values based on their last number
        //Here 1 means swapping and -1 no swapping
        Collections.sort(values,(o1, o2) -> (o1%10)>(o2%10)?1:-1);

        for(Object o:values){
            System.out.println(o);
        }
    }
}
