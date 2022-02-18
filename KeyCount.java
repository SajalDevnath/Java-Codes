package com.javacodes;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class KeyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character,Integer> map = new HashMap<>();
        System.out.println("Enter a sentence: ");
        char[] chArray = sc.nextLine().toLowerCase().toCharArray();
        for(char ch : chArray){
            if(Character.isLetterOrDigit(ch)){
                if(map.containsKey(ch))
                map.replace(ch, map.get(ch) + 1);
                else
                    map.put(ch, 1);
            }
        }
        System.out.println("Map: \n"+map);
        int big = 0;
        for(int val: map.values()) {
            if (val > big)
                big = val;
        }
        System.out.println("Highest frequency: "+ big);
        System.out.println("Characters: ");
        for(char key : map.keySet()){
            if(map.get(key) == big)
                System.out.print(key + "");
        }
    }
}
