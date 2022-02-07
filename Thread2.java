package com.javacodes;

// Creating threads using runnable interface.

class worker1 implements Runnable{
    public void run(){
        for(int i = 1; i <= 20; i++){
            System.out.println("Thread 1 is working");
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e){
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class worker2 implements Runnable{
    public void run(){
        for(int i = 1; i <= 20; i++){
            System.out.println("Hello from thread 2");
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e){
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class Thread2 {
    Thread t1,t2;
    Thread2(){
        t1 = new Thread(new worker1());
        t2 = new Thread(new worker2());

        t1.setPriority(5);
        t2.setPriority(10); // Priority range is 1 to 10.

        t1.start();
        t2.start();
    }
    public static void main(String[] args) {
        new Thread2();
    }
}
