package com.Collection;

import java.util.*;

public class CollectionDemo {

    public static void main(String[] args) {
        Collection values = new ArrayList();
        values.add(4);
        values.add(6);
        values.add(9);

        Iterator it = values.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
