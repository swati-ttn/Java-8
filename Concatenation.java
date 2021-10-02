package com.ttn.java.Java8;

@FunctionalInterface
interface StringConcatenation
{
    String concatTwoStrings(String s1, String s2);
}

public class Concatenation {
    public static void main(String[] args)
    {
        StringConcatenation StringConcate = (s1, s2) -> s1.concat(s2);
        System.out.println("Concatenated Strings: " + StringConcate.concatTwoStrings("Swati", "Panwar"));
    }
}