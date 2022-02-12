package com.javacodes;
import java.io.*;
import java.util.*;
public class Stocks {
    public static void main(String[] args)throws Exception {
        FileReader fr = new FileReader("C:\\Users\\devna\\Downloads\\google_stock_price");
        BufferedReader br = new BufferedReader(fr);
        ArrayList<Object> list = new ArrayList<Object>();
        ArrayList<Double> list1 = new ArrayList<Double>();

        String s;
        int ok = 0, S = 0, Ex = 0;
        Double std = 0d;
        Double Max = 0d;
        Double mean;
        Double Total = 0d;
        int Total_count = 0;
        Double Min = Double.MAX_VALUE;
        br.readLine();
        while((s = br.readLine()) != null){
            Max = Math.max(Max,Double.parseDouble(s));
            Min = Math.min(Min,Double.parseDouble(s));
            Total += Double.parseDouble(s);
            Total_count += 1;
            if(Double.parseDouble(s) > 500)
                Ex++;
            else
            if(Double.parseDouble(s) >= 200 && Double.parseDouble(s) <= 500)
                S++;
            else if(Double.parseDouble(s) < 60)
                ok++;
            list1.add(Double.parseDouble(s));
        }
        mean = Total/Total_count;
        for(int i = 0; i < list1.size(); i++){
            std += Math.pow(list1.get(i) - mean, 2);
        }
        std = Math.sqrt(std/Total_count);
        list.add(Max);
        list.add(Min);
        list.add(Total);
        list.add(mean);
        list.add(std);
        list.add(Ex);
        list.add(S);
        list.add(ok);
        fr.close();
        br.close();
        System.out.println(list);
    }
}

