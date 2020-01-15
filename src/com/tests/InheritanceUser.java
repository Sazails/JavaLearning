package com.tests;

public class InheritanceUser extends InheritanceTest{

    public void execFunc(){
        setUserName("Joan");
        setAge((byte)27);
        System.out.println(super.toString());
    }

//    public void execFunc(){
//        InheritanceTest user = new InheritanceTest();
//        user.setUserName("Joana.L");
//        user.setAge((byte)27);
//        System.out.println(user);
//    }
}
