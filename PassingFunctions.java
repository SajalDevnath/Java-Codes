package com.javacodes;
import java.util.Arrays;
import java.util.Scanner;

public class PassingFunctions {
    public static void main(String[] args) {
        int[] nums = {9, 8, 7, 6};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] nums){
        nums[0] = 99;
    }
}
