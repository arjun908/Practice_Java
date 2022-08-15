package com.Collection;

import java.util.*;

public class SetInterface {
    public static void main(String[] args) {

        Set<Integer> values=new TreeSet<>();
        System.out.println(values.add(55));
        System.out.println(values.add(36));
        System.out.println(values.add(95));
        System.out.println(values.add(60));
        //Collections.reverse((List<?>) values);
        //Set only prints unique elements so no duplicate elements
        //Set also prints value randomly because we are using hashset
        //But with Treeset values will be printed in ascending order

        for(int i:values){
            System.out.println(i);
        }
    }
}
