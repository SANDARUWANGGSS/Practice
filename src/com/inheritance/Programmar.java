package com.inheritance;

public class Programmar extends Employee{
    int bonus=50000;
    public static void main(String[] args) {
        Programmar p=new Programmar();

        System.out.println("Programmar salary is "+p.salary);
        System.out.println("Programmar salary is "+p.bonus);
        System.out.println("Programmar salary is "+(p.bonus+p.salary));
    }
}
