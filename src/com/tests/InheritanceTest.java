package com.tests;

public class InheritanceTest {

    private String userName;
    private byte age;

    public InheritanceTest(){
        this.userName = "";
        this.age = 0;
    }

    public InheritanceTest(String userName, byte age){
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public byte getAge() {
        return age;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "InheritanceTest{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }
}
