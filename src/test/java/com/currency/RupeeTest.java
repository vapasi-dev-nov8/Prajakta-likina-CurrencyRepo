package com.currency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class RupeeTest {
    @Test
    void addRupee()
    {
        // Given
        Rupee rupeeFive = new Rupee(5);
        Rupee rupeeTwo = new Rupee(2);

        //When
        Rupee rupeeResult = rupeeFive.add(rupeeTwo);

        //Expected
        Rupee rupeeSeven = new Rupee(7);

        assertEquals(rupeeSeven.value ,rupeeResult.value);



    }
   /* @Test
    void compareRupee()
    {
        // Given
        Rupee rupeeTenNote = new Rupee(10);
        Rupee rupeeTenCoin = new Rupee(10);
        assertEquals(rupeeSeven.value ,rupeeResult.value);
}*/
