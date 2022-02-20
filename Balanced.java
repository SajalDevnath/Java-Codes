package com.javacodes;
import java.util.LinkedList;
import java.util.Scanner;
public class Balanced {
    public static void main(String[] args) {
        LinkedList<Character>stk = new LinkedList<Character>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression without spaces: ");
        char[] chArr = sc.next().toCharArray();
        boolean Balanced = true;
        boolean wrong = false;
        stk.push('.');
        stk.push('.');
        for(char ch : chArr){
            switch(ch) {
                case '{':
                case '[':
                case '<':
                    stk.push(ch);
                    break;
                case '}':
                    if (stk.pop() != '{') Balanced = false;
                    break;
                case ']':
                    if (stk.pop() != '[') Balanced = false;
                    break;
                case ')':
                    if (stk.pop() != '(') Balanced = false;
                    break;
                case '>':
                    if (stk.pop() != '<') Balanced = false;
                    break;
                default:
                    System.out.println("Wrong Expression");
                    wrong = true;
            }
            if(!Balanced)
                break;
            }
        if(Balanced && stk.pop() == '.' && !wrong)
            System.out.println("Expression is balanced");
        else
            System.out.println("Expression not balanced");
        }
}

