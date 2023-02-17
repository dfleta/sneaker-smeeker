package edu.crapcraft.raffle;


import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;



public class SneakerTest {

    private Raffle sneaker;

    @Before
    public void setup() {
        this.sneaker = new Sneaker("Nike Craft General Purpose", "Brown", 109.99);
    } 

    @org.junit.Test
    public void sizesRun() {
        
        this.sneaker.sizesRun(Sizes.CUARENTA, Sizes.CUARENTAYDOS);
        assertArrayEquals(new String[]{"7.0 US", "7.5 US", "8.0 US", "8.5 US"}, ((Sneaker) sneaker).sizes());
    }
    
}
