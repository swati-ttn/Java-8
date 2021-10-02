package com.ttn.java.Java8;

interface InterfaceSound {
    default void Animal()
    {
        System.out.println("Animals with sounds !!!!");
    }
}

interface InterfaceEyes {
    default void Animal() {
        System.out.println("Animals in with Eyes!!!!");
    }
}

public class MultipleImplementationAnimal implements InterfaceSound, InterfaceEyes
{
    public void Animal() {
        InterfaceSound.super.Animal();
        InterfaceEyes.super.Animal();
    }

    public static void main(String[] args) {
        MultipleImplementationAnimal sound = new MultipleImplementationAnimal();
        sound.Animal();
    }
}