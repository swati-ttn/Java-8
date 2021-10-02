package com.ttn.java.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class IntGreaterThanThree {
    public static void main(String[] args)
    {
    List<Integer> intList = Arrays.asList(1,2,3,5,6,7,8,9,10);
        System.out.println(" first even number in the integer list which is greater than 3  : " +intList ) ;
        Optional<Integer> optionalInteger = intList.stream()
                .filter(integer -> integer > 3)
                .filter(integer -> integer % 2 == 0)
                .findFirst();
        if (optionalInteger.isPresent())
            System.out.println("Displaying First Even integer greater than three: " + optionalInteger);
        else
            System.out.println("No even integers greater than three");
    }

    }
