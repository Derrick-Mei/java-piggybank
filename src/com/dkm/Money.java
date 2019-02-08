package com.dkm;

abstract class Money
{
    String name;
    double value;
    int quantity = 1;

    public Money(String name, double value, int quantity)
    {
        this.name = name;
        this.value = value;
        this.quantity = quantity;
    }

    public Money(String name, double value)
    {
        this.name = name;
        this.value = value;
    }

    double getValue()
    {
        return quantity * value;
    }

    String getString()
    {
        if (name.equalsIgnoreCase("$"))
        {
            return name + quantity;
        }
        else
        {
            return quantity + " " + name;
        }
    }
}
