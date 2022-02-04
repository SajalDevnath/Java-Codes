package com.javacodes;
import java.io.*;
import java.util.HashMap;
public class Pokemon {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("C:\\Users\\devna\\Downloads\\pokemon.csv");
        BufferedReader sc = new BufferedReader(fr);
        String line[];
        HashMap<String, Integer> hm = new HashMap<>();
        try {
            while ((line = sc.readLine().split(",")) != null) {
                break;
            }
            while ((line = sc.readLine().split(",")) != null) {
                hm.put(line[1], hm.getOrDefault(line[1], 0)+1);
            }
        } catch (Exception e) {
            System.out.println(hm);
        }
    }
}
