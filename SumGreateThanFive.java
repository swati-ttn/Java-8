package com.ttn.java.Java8;


import java.util.Arrays;
import java.util.List;

public class SumGreateThanFive
{
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println("Array List : " + intList);
        System.out.println("Sum of all even integers greater than 5: " +
                intList.stream()
                        .filter(integer -> integer > 5).reduce(0, (numOne, numTwo) -> numOne + numTwo));
    }
}