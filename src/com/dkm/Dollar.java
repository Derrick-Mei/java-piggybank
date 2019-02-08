package com.dkm;

class Dollar extends Money
{
    public Dollar(int quantity)
    {
        super("$", 1, quantity);
    }

    public Dollar()
    {
        super("$", 1);
    }

    @Override
    public String toString()
    {
        return quantity + " " + name;
    }
}
