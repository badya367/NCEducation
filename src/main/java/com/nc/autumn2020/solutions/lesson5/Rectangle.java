package com.nc.autumn2020.solutions.lesson5;

public class Rectangle extends Figure{
    private float width;
    private float height;

    Rectangle(float width, float height){

        this.width = width;
        this.height = height;
    }

    public float getPerimeter(){

        return width * 2 + height * 2;
    }

    public float getArea(){

        return width * height;
    }
}
