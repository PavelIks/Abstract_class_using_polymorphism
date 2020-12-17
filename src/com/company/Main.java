package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Employee e = new Employee("Test1", 90, 200, 20000, "Test2");
        System.out.println(e.name + "\n" + e.age + "\n" + e.grow + "\n" + e.salary + "\n" + e.transport);
        /*System.out.println("Введите текст: ");
        Scanner s = new Scanner(System.in);
        String w = s.next();

        System.out.println("Введите перевод: ");
        String w1=s.next();*/
    }
}