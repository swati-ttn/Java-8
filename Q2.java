package com.ttn.java.Java8;

@FunctionalInterface
    interface returntwo
    {
        int returnone(int a, int b);
    }

public class Q2 {
    public static void main(String[] args) {
        returntwo takesTworeturnOne = (a,b)-> a*b;
        System.out.println(" Takes two interger : 10 & 20 = (Multiplication)    " + takesTworeturnOne.returnone(10, 20));
    }
}