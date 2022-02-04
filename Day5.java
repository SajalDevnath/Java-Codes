package com.javacodes;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Day5 {
    public static HashMap<Character, Integer> frequency(String s){
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
        }
        return hm;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        HashMap<Character, Integer> hm = frequency(sc.nextLine());
        for(Map.Entry<Character, Integer> entry: hm.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
