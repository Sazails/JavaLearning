package com.company;

public class InterfaceUser implements InterfaceTest  {
    public void execFunc(){
        print("Hello Java Interface!");
    }

    @Override
    public void print(String str) {
        System.out.println(str);
    }
}
