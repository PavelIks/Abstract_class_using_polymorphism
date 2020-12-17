package com.company;

public class Employee extends Human
{
    String name;
    int age;
    int grow;

    int salary;
    String transport;

    Employee(){}
    Employee(String name, int age, int grow, int salary, String transport)
    {
        super(name, age, grow);
        this.salary=salary;
        this.transport=transport;
    }
    @Override
    public void Print()
    {
        System.out.printf("Name:%s; \nAge:%d; \nGrow:%d; \nSalary:%d hrn; \nTransport:%s;\n", super.getName(), super.getAge(), super.getGrow(), this.salary, this.transport);
    }

    @Override
    public void Move()
    {
        System.out.println();
    }
}