package com.nc.autumn2020.solutions.lesson3;

public class Solution1 {
    public void run(String[] args){
        Pc some_pc = new Pc.Builder("Windows", "i7", (short)250).
                ram((short)16).
                graphic_cards_mb((short)4096).
                color("Space_gray").
                build();
        System.out.println(some_pc);
    }
}
