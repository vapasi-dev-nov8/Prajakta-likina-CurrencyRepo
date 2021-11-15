package com.currency;

public class Rupee {
    int value;

    public Rupee(int value) {
        this.value = value;
    }

    public Rupee add(Rupee rupee) {

        Rupee rupee3 =new Rupee(value+ rupee.value);
        return rupee3;
    }
}
