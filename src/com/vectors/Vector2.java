package com.vectors;

public class Vector2 {
    private double x;
    private double y;

    public Vector2(){
        this.x = 0;
        this.y = 0;
    }

    public Vector2(double x, double y){
        this.x = x;
        this.y = y;
    }

    public static Vector2 addVectors(Vector2 a, Vector2 b) {
        return new Vector2(a.x + b.x, a.y + b.y);
    }

    public static Vector2 minusVectors(Vector2 a, Vector2 b) {
        return new Vector2(a.x - b.x, a.y - b.y);
    }

    @Override
    public String toString() {
        return "Vector2{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
