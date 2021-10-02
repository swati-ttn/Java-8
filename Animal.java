package com.ttn.java.Java8;


interface DisplayInterfaceAnimal{
    default int eyes()
    {
        return 2;
    }
    static int legs()
    {
        return 4;
    }
    int displayabstract();
}

class Dog implements DisplayInterfaceAnimal
{
    public int displayabstract() {
        return 0;
    }
}

class ExecutionAnimal
{
    public static void main(String[] args)
    {
        DisplayInterfaceAnimal dog = new Dog();
        System.out.println("Dogs have " + dog.eyes() + " eyes"); // default method
        System.out.println("Dogs have " + DisplayInterfaceAnimal.legs() + " legs"); // static method
    }
}

















