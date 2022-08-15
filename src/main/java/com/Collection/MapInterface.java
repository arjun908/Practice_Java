package com.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {

    public static void main(String[] args) {

        Map<String,String> map=new HashMap<>();
        map.put("myname","arjun");
        map.put("father","ajay");
        map.put("mother","archana");



        //System.out.println(map);
        //In hashmap also concept of hashcode is there which makes it print randomly.
        //Any key which is not available it will give value null.
        //If we have to print it the way we did input we will do it according to keys.
        //Since we are using set for keys hence keys can't be repeated.
        //Hashtable is syncronized and hashmap is not.
        //so for threadsafety we use hashtable.

        Set<String> keys=map.keySet();

        for(String key:keys){
            System.out.println(key+" "+map.get(key));
        }


    }
}
