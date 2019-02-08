package com.dkm;

public class Dollar extends Money
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
        return "Dollar{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", quantity=" + quantity +
                '}';
    }
}
