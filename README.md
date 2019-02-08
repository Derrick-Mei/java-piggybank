We have a magical "piggy bank" (a piggy bank is the traditional name of a place to store coins, bill, money). The piggy bank is magical because it can hold unlimited amounts of money. However, you can not get the money out of it.

Create a collection (array, arraylist, or hashmap) to represent the piggy bank. The collection can hold money.  
This money can be
* A Dollar worth $1.00
* A Quarter worth $0.25
* A Dime worth $0.10
* A Nickle worth $0.05
* A Penny worth $0.01
Each coin object should know its value, how many of that coin is in the object, and how to print its value.

The main program will look something like this pseudocode (remember pseudocode is not meant to be syntactically correct but explain the algorithm):

* Create collection
* piggyBank.add(new Quarter())
* piggyBank.add(new Dime())
* piggyBank.add(new Dollar(5))
* piggyBank.add(new Nickle(3))
* piggyBank.add(new Dime(7))
* piggyBank.add(new Dollar())
* piggyBank.add(new Penny(10))
* Print the contents of the Piggy Bank
  * on the console should appear  
    `1 Quarter`  
    `1 Dime`  
    `$5`  
    `3 Nickle`  
    `7 Dime`  
    `$1`  
    `10 Penny`  
* Print the value of the Piggy Bank
  * on the console should appear  
    `The piggy bank holds $7.3`  
  * Note: do not worry about the format of the 7.2 Either 7.2 or 7.20 would be correct. Also notice that we are not concerned with adding the S for plurals with our names of our coins.

1. create classes for the money
    1. each money class needs to inherit from a interface or abstract class so that arraylist can hold all types of money
    2. I will choose abstract class, because I can have non final and non static fields, and I don't need multiple inheritance from interface
    3. interface/abstract class needs methods getString() and getValue
    4. money classes need fields name and quantity = 1, value
    
2. Create piggyBank
    1. Order matters so either array or ArrayList
    2. piggyBank needs unlimited space so we need ArrayList and it has more built in methods
    