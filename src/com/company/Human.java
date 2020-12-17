package com.company;

public abstract class Human implements Humanable
{
    String name;
    int age;
    int grow;
    Human(){}
    Human(String name, int age, int grow)
    {
        this.name=name;
        this.age=age;
        this.grow=grow;
    }
    public String getName() {return name;}
    public int getAge() {return age;}
    public int getGrow() {return grow;}
    @Override
    public void Print()
    {

    }
    public abstract void Move();
}
