package com.company;

public abstract class Game implements GameInt
{
    String Name;

    Game(String name)
    {
        this.Name=name;
    }

    public String getName()
    {
        return Name;
    }

    public void Display()
    {
        RTS e = new RTS("Test2", 2);
        e.Display();
    }

    public abstract void DisplayRTS();
}
