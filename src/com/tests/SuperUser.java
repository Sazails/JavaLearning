package com.tests;

public class SuperUser extends SuperTest {
    public void executeFunc(){
        System.out.println("SuperUser just printed.");
        super.printHello();
    }
}
