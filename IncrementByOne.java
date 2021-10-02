package com.ttn.java.Java8;

@FunctionalInterface
interface Increment
{
    int addOne(int number);
}

class IncrementByOne
{
    public static void main(String[] args)
    {
        Increment incrementByOne = number -> number + 1;
        System.out.println("10 incremented by 1: " + incrementByOne.addOne(10));
    }
}
