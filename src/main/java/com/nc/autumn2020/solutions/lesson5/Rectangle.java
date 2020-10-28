package com.nc.autumn2020.solutions.lesson5;

public class Rectangle extends Figure {
    private int width;
    private int height;

    Rectangle(int width, int height){

        this.width = Math.abs(width);
        this.height = Math.abs(height);
    }

    public int getPerimeter(){

        return width * 2 + height * 2;
    }

    public int getArea(){

        return width * height;
    }


    @Override
    public void draw() {
        System.out.println("Нарисовал прямоугольник");
    }
}
