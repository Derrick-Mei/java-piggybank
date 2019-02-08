package com.dkm;

abstract class Money
{
    final String name;
    final double value;
    int quantity = 1;

    Money(String name, double value, int quantity)
    {
        this.name = name;
        this.value = value;
        this.quantity = quantity;
    }

    Money(String name, double value)
    {
        this.name = name;
        this.value = value;
    }

    double getValue()
    {
        return quantity * value;
    }

    // If Dollar return $1, else if quantity > 1 return plural else return normal
    String getString()
    {
        if (name.equalsIgnoreCase("$"))
        {
            return name + quantity;
        }
        else
        {
            if (quantity > 1)
            {
                if (name == "Penny")
                {
                    return quantity + " Pennies";
                }
                return quantity + " " + name + "s";
            }
            else
            {
            return quantity + " " + name;
            }
        }
    }
}
