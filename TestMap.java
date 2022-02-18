package com.javacodes;
import java.util.Map;
import java.util.HashMap;
public class TestMap {
    public static void main(String[] args) {
        Map<Integer,String>test = new HashMap<Integer,String>();
        test.put(2,"Abhi");
        test.put(4,"Anurag");
        test.put(6,"Aman");
        test.put(3,"Anu");

        System.out.println(test.keySet());
        for(Integer name: test.keySet()){
            System.out.println("Key: " + name);
            System.out.println(test.get(name));
        }
        System.out.println(test.values());
        for(String url : test.values())
            System.out.println("Value: "+ url);
        System.out.println(test.entrySet());
        for(Map.Entry<Integer, String> entry : test.entrySet())
            System.out.println("Key = "+ entry.getKey()+", Value = "+ entry.getValue());
    }
}
