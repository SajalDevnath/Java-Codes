package com.javacodes;
import java.util.Scanner;
public class Timer implements Runnable {
    int sec;
    Timer(int s){
        sec = s;
    }
    static String getTime(int s){
        String time = "";
        String[] digits = {"00","01","02","03","04","05","06","07","08","09"};
        time += ":"+(s%60<10?digits[s%60] : s%60);
        s/=60;
        time = (s%60<10?digits[s%60] : s%60) + time;
        return time;
    }
    @Override
    public void run(){
        for(int i = sec; i>=0; i--){
            try{
                System.out.println(getTime(i));
                Thread.sleep(1000);
            }
            catch(InterruptedException ie){
                System.out.println("Exception in Thread: "+ie.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of seconds");
        Timer t = new Timer(sc.nextInt());
        Thread t1 = new Thread(t);
        t1.start();
    }
}
