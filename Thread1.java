package com.javacodes;

class worker extends Thread{
    public void run(){
        // run is a predefined method. when a thread is started it automatically
        // looks for run method.
        // the job of a thread is defined inside run method.
        for(int i = 1; i <= 10; i++){
            System.out.println("Thread 1 is running...." + new java.util.Date());
            try{
                Thread.sleep(1000); // 1000 ms = 1 sec
            } catch(InterruptedException e){
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
public class Thread1 {
    public static void main(String[] args) {
        worker w1 = new worker();
        w1.start(); // start method is used to start a thread. which indirectly calls run() method.
    }
}
