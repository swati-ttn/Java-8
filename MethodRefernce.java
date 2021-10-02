package com.ttn.java.Java8;


@FunctionalInterface
    interface A
{
    int Integers( int a , int b );
}
public class MethodRefernce {
    int add(int a, int b)
    {
        return a + b;
    }

    int subtract(int a, int b)
    {
        return a - b;
    }

 /*  static multiply(int a, int b)
    {
        return a * b;
    }*/

    public static void main(String[] args) {
        A method = new MethodRefernce()::add ;
        System.out.println("Adding (10 ,5 ) :" + method.Integers(10,5));
        method = new MethodRefernce()::subtract;
        System.out.println("Subtraction (10 ,5 ):" + method.Integers(10,5));
       // method = new MethodRefernce()::multiply ;
        //System.out.println("Multiplication :" + MethodRefernce.Integers(10,5));
    }
}
