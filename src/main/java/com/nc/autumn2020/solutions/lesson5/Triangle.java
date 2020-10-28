package com.nc.autumn2020.solutions.lesson5;

public class Triangle extends Figure{
    private int a;
    private int b;
    private int c;
    private int h;

    Triangle(int a, int b, int c, int h){

        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public int getPerimeter(){

        return a * b * c;
    }

    public int getArea(){

        return a * h;
    }
}
