package com.threadsynchronization;

class Counter{
    int count;
    public synchronized void increment(){//We should make our method synchronized so that
        // one thread access method at a time and it is thread safe
        count++;
    }
}

public class SynchDemo {

    public static void main(String[] args) throws InterruptedException {
        Counter c=new Counter();

        Thread t1=new Thread(()->
        {

                for(int i=1;i<=1000;i++){
                    c.increment();
                }
        } );
        Thread t2=new Thread(()->
        {

            for(int i=1;i<=1000;i++){
                c.increment();
            }
        } );

       t1.start();
       t2.start();
       t1.join();
       t2.join();
       System.out.println("Count:- "+ c.count);
    }
}
