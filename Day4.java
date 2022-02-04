package com.javacodes;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Day4 {
    static BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int pay = Integer.parseInt(sc.readLine());
        if(pay >= 5000){
            int hra = (15*pay)/100;
            int da = (int)1.5*pay;
            System.out.println("hra "+hra);
            System.out.println("da "+da);
            System.out.println("gross "+(pay+da+hra));
        }
        else{
            int hra = pay/10;
            int da = (int)1.1*pay;
            System.out.println("hra "+hra);
            System.out.println("da "+da);
            System.out.println("gross "+(pay+da+hra));
        }
    }
}
