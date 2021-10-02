package com.ttn.java.Java8;

@FunctionalInterface
interface GreaterNumber {
    boolean Greater(int x, int y);
}

public class GreaterOrNot
{
    public static void main(String[] args)
    {
        GreaterNumber greaterNumber = (firstNumber, secondNumber) ->
        {
            if (firstNumber > secondNumber)
                return true;
            else return false;
        };

        System.out.println("10>20  greater or not : " + greaterNumber.Greater(10, 20));
        System.out.println("15>10 greater or not : " + greaterNumber.Greater(15, 10));
    }
}

