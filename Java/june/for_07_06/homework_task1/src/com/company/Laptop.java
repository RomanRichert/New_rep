package com.company;

public class Laptop extends Elecronics {

    String ram;
    public Laptop(String maker, String name, String ram, double price) {
        super(name, maker, price);
        this.ram = ram;

    }

    @Override
    public void buy(int amount) {
        super.buy(amount);
        addGuarantee(amount);
    }
}
