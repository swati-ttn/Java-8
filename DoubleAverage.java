package com.ttn.java.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


    public class DoubleAverage {
        public static void main(String[] args) {
            List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
            System.out.println("Array List : " + intList);
            System.out.println("Doubling numbers and There Averaging : " +
                    intList.stream().map(integer -> integer * 2)
                            .collect(Collectors.averagingInt(Integer::intValue)));
        }
    }
