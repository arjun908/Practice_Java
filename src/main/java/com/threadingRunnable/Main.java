package com.threadingRunnable;



public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread t1=new Thread(() -> {
            for(int i=1;i<=5;i++){
                System.out.println("Bye");
//           try{ Thread.sleep(1000);} catch(Exception e){};
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },"bye");
        Thread t2=new Thread(() -> {

            for (int i = 1; i <= 5; i++) {
                System.out.println("Tata");
//           try{ Thread.sleep(1000);} catch(Exception e){};
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },"Tata");
//        t1.setName("Bye Thread");
//        t2.setName("Hello thread");
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        t1.start();// Start will automatically call run mmethod internally we don't need object for that
        try{Thread.sleep(10);} catch(Exception e){}
        t2.start();// Start will automatically call run mmethod internally we don't need object for that
        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());


        t1.join();
        t2.join();

        System.out.println("Khatam Tata Bye Bye ");

        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());






    }
}

