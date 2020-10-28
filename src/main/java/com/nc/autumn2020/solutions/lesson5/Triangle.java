package com.nc.autumn2020.solutions.lesson5;

public class Triangle {
    private float a;
    private float b;
    private float c;
    private float h;

    Triangle(float a, float b, float c, float h){

        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public float getPerimeter(){

        return a * b * c;
    }

    public float getArea(){

        return a * h;
    }
}
