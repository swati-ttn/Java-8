package com.ttn.java.Java8;

@FunctionalInterface
interface UC
{
    String stringToUpper(String myString);
}

public class UpperCase {
    public static void main(String[] args)
    {
        UC stringToUppercase = myString -> myString.toUpperCase();
        System.out.println("swati panwar in UpperCase :" + stringToUppercase.stringToUpper("swati panwar"));
    }
}