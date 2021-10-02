package com.ttn.java.Java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface
{
    public static void main(String[] args)
    {
        Consumer<Integer> consumer = myInteger -> System.out.println("Adding 12 ,10: " + (myInteger + 12));
        consumer.accept(10);

        Supplier<Integer> supplier = () -> 10 * 20;
        System.out.println("10 multiplied by 20: " + supplier.get());

        Predicate<Integer> predicate = integer -> integer % 2 == 0;
        System.out.println("Is 9 even? " + predicate.test(9));


        Function<String, Integer> function = myString -> myString.length();
        System.out.println("Length of 'Swati': " + function.apply("Swati"));
    }
}



