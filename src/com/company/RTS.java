package com.company;

public class RTS extends Game
{
    String Name;
    int Salary;
    RTS(String name, int salary)
    {
        super(name);
        this.Salary=salary;
    }

    public void DisplayRTS()
    {
        System.out.printf(super.getName(), this.Salary);
    }
}