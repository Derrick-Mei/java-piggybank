package com.dkm;

public class Dime extends Money
{
    public Dime(int quantity)
    {
        super("Dime", .1, quantity);
    }

    public Dime()
    {
        super("Dime", .1);
    }

    @Override
    public String toString()
    {
        return quantity + " " + value;
    }
}
