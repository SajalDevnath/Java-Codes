package com.javacodes;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class DistinctSqr {
    public static void main(String[] args) {
        List<Integer>numbers = Arrays.asList(9, 10, 3, 4, 7, 4);
        List<Integer>distinct = numbers.stream()
                .distinct()
                .map(i -> i*i)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(distinct);
    }
}
