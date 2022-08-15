package com.threading;

public class Hi extends Thread{

    public void run(){

        for(int i=1;i<=5;i++){
            System.out.println("Hi");
//           try{ Thread.sleep(1000);} catch(Exception e){};
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
