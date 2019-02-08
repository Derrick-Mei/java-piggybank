package com.dkm;

class Quarter extends Money
{
    public Quarter(int quantity)
    {
        super("Quarter", .25, quantity);
    }

    public Quarter()
    {
        super("Quarter", .25);
    }

    @Override
    public String toString()
    {
        return quantity + " " + name;
    }
}
