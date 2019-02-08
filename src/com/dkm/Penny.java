package com.dkm;

class Penny extends Money
{
    public Penny(int quantity)
    {
        super("Penny", .01, quantity);
    }

    public Penny()
    {
        super("Penny", .01);
    }

    @Override
    public String toString()
    {
        return quantity + " " + value;
    }
}
