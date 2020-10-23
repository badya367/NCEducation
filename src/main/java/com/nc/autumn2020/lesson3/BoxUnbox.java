package com.nc.autumn2020.lesson3;

public class BoxUnbox {
    public BoxUnbox() {


        // автоупаковка

        Integer i = 10;

        // автоупаковка метода

        box(10);
        //автораспаковка
        int i1 = new Integer(10);

        unbox(new Integer(10));

        Integer integer = new Integer(10);
        box(integer);


        // регулярные выражения

        int i3 = new Integer(10) + new Integer(10);

        boolean b = new Integer(10) < new Integer(1);

        Integer value = 1;
        Integer value2 = 1;
        System.out.println(value==value2);
    }

    void box(Integer i) {

    }

    void unbox(int i){

    }

}
