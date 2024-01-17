// File: AnotherClass.java
package com.example.mypackage;

public class AnotherClass {
    public static void main(String[] args) {
        // Accessing final class
        FinalClass finalObject = new FinalClass();
        System.out.println("Final Variable: " + finalObject.finalVariable);
        finalObject.finalMethod();
    }
}