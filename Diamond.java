package com.javacodes;
import java.sql.SQLOutput;
public class Diamond {
         void display(int n){
            int sp = n/2, st = 1;
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= sp; j++)
                    System.out.print(" ");

                int count = st / 2 + 1;
                for(int k = 1; k <= st; k++){
                    System.out.print(count);
                    if(k <= st / 2)
                        count--;
                    else
                        count++;
                }
                System.out.println();
                if(i <= n /2){
                    sp = sp - 1;
                    st = st + 2;
                }
                else{
                    sp = sp + 1;
                    st = st - 2;
                }
            }
        }

    public static void main(String[] args) {
        Diamond p = new Diamond();
        int n = 7;
        p.display(n);
    }
    }
