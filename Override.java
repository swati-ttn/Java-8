package com.ttn.java.Java8;

interface InterfaceAnimal{
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

class cat implements InterfaceAnimal
{
    @java.lang.Override
    public int displayabstract() {
        return 0;
    }
}

class Bee implements InterfaceAnimal {
    @java.lang.Override
    public int eyes() {
        return 6;
    }

    public int legs() {
        return 10;
    }

    @java.lang.Override
    public int displayabstract() {
        return 0;
    }
}

class Override
{
    public static void main(String[] args)
    {
        InterfaceAnimal cat = new cat();
        System.out.println("Dogs have " + cat.eyes() + " eyes");
        System.out.println("Dogs have " + InterfaceAnimal.legs() + " legs");

        InterfaceAnimal bees = new Bee();
        System.out.println("Override----- Honeybee have " + bees.eyes() + " eyes");
        System.out.println("Override -----Honeybee have " + InterfaceAnimal.legs() + " legs");
    }
}

















