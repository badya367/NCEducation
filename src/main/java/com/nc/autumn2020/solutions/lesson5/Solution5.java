package com.nc.autumn2020.solutions.lesson5;

public class Solution5 {
    public void run() {
        Figure rectangle = new Rectangle(10,2);
        Figure triangle = new Triangle(1,2,3,4);
        Figure[] figures = new Figure[] {rectangle, triangle};
        int sum = 0;
        for (Figure figure: figures) {
            rectangle.getPerimeter();
            rectangle.getArea();
            triangle.getPerimeter();
            triangle.getArea();
            sum = rectangle.getPerimeter() +
                    rectangle.getArea() +
                    triangle.getPerimeter() +
                    triangle.getArea();
        }

        System.out.println(sum);
    }
}
