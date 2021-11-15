package com.currency;

public class Rupee {
    int value;

    public Rupee(int value) {
        this.value = value;
    }

    public Rupee add(Rupee rupee) {

        Rupee rupee3 = new Rupee(value + rupee.value);
        return rupee3;
    }

    public int compare(Rupee rupeeTenCoin) {
        if (value == rupeeTenCoin.value)
            return 1;
        return 0;
    }
}
