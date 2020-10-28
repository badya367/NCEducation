package com.nc.autumn2020.solutions.lesson5;

public class Triangle extends Figure{
    private int a;
    private int b;
    private int c;
    private int h;

    Triangle(int a, int b, int c, int h){

        this.a = Math.abs(a);
        this.b = Math.abs(b);
        this.c = Math.abs(c);
        this.h = Math.abs(h);
    }

    public int getPerimeter(){

        return a * b * c;
    }

    public int getArea(){

        return a * h;
    }
}
