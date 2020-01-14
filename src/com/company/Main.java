package com.company;
import com.vectors.*;

public class Main{
    public static void main(String[] args) {
//        printOutMath();
//
//        // Learning abstracting
//        AbstractUser user = new AbstractUser();
//        System.out.println(user.addNumbers(new double[]{2,4,6,8}));
//
//        // Learning super
//        SuperUser user = new SuperUser();
//        user.executeFunc();
//
//        // Learning instances
//        Vector2 vec0 = new Vector2(1, 1);
//        Vector2 vec1 = new Vector2(1, 1);
//        Vector3 vec2 = new Vector3(1, 1, 1);
//        Vector3 vec3 = new Vector3(1, 1, 1);
//
//        // Adding vectors of same type
//        Vector2 temp0 = Vector2.addVectors(vec0, vec1);
//        Vector2 temp1 = Vector2.minusVectors(vec0, vec1);
//        Vector3 temp2 = Vector3.addVectors(vec2, vec3);
//        Vector3 temp3 = Vector3.minusVectors(vec2, vec3);
//
//        System.out.println(temp0);
//        System.out.println(temp1);
//        System.out.println(temp2);
//        System.out.println(temp3);

        InterfaceUser user = new InterfaceUser();
        user.execFunc();
        user.print("Another interface call!");
    }

    // Some testing...
    /*private static void printOutMath(){
        // Printing out different math situations.
        int a = 5;
        int b = 10;

        System.out.println("Add: " + (a + b));
        System.out.println("Minus: " + (a - b));
        System.out.println("Divide: " + (a / b));
        System.out.println("Multiply: " + (a * b));
        System.out.println("Modulo: " + (a % b));
    }*/
}
