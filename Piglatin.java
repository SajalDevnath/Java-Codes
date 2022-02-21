package com.javacodes;

public class Piglatin {
    static String getPiglatin(String s){
        int index = -1;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            switch(ch){
                case'a': case'e': case'i': case'o': case'u': index = i;
            }
            if(index >= 0)
                break;
        }
        if(index == -1 || s.length() == 1)
            return s +"ay";
        else
            return s.substring(index)+s.substring(0,index) + "ay";
    }

    public static void main(String[] args) {
        String sent = "Show the code again";
        String[] words = sent.split("");
        for(String word : words){
            System.out.print(getPiglatin(word)+ "");
        }
    }
}
