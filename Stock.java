package com.javacodes;
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
public class Stock {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("C:\\Users\\devna\\Downloads\\google_stock_price.csv");
        BufferedReader sc = new BufferedReader(fr);
        String line;
        float maxStock = Float.MIN_VALUE;
        float minStock = Float.MAX_VALUE;
        try{
            while((line = sc.readLine())!=null){
                break;
            }
            while((line = sc.readLine())!=null){
                if(maxStock < Float.parseFloat(line)){
                    maxStock = Float.parseFloat(line);
                }
                if(minStock > Float.parseFloat(line)){
                    minStock = Float.parseFloat(line);
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
