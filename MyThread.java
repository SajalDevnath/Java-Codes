package com.javacodes;

public class MyThread implements Runnable{
    String message;
    int n;
    int time;
    MyThread(String msg, int n, int time){
        message = msg;
        this.n = n;
        this.time = time;
    }
    @Override
    public void run(){
        for(int count = 0; count <= n; count++){
            try{
                System.out.println(message);
                Thread.sleep(time);
            }
            catch(InterruptedException ie){
                System.out.println("Exception in Thread: "+ie.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread("Message 1", 5, 100));
        t1.start();
        Thread t2 = new Thread(new MyThread("Message 2", 10, 100));
        t2.start();
    }
}
