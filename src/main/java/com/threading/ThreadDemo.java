package com.threading;

public class ThreadDemo {

    public static void main(String[] args) {

        Hi obj1=new Hi();
        Hello obj2=new Hello();
        obj1.start();// Start will automatically call run mmethod internally we don't need object for that
        try{Thread.sleep(10);} catch(Exception e){}
        obj2.start();// Start will automatically call run mmethod internally we don't need object for that
//        obj1.run();
//        obj2.run();


    }
}
