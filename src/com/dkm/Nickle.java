package com.dkm;

class Nickle extends Money
{
    public Nickle(int quantity)
    {
        super("Nickle", .05, quantity);
    }

    public Nickle()
    {
        super("Nickle", .05);
    }

    @Override
    public String toString()
    {
        return quantity + " " + value;
    }
}
