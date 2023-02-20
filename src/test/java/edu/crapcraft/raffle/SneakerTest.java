package edu.crapcraft.raffle;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class SneakerTest {

    private Raffle sneaker;

    @Before
    public void setup() {
        this.sneaker = new Sneaker("Nike Craft General Purpose", "Brown", 109.99);
    } 

    @Test
    public void sizesRun() {
        
        this.sneaker.sizesRun(Sizes.CUARENTA, Sizes.CUARENTAYDOS);
        assertArrayEquals(new String[]{"7.0 US", "7.5 US", "8.0 US", "8.5 US"}, ((Sneaker) sneaker).sizes());
    }

    // test de integracion
    @Test
    public void register_varargs_test() {

        Entry squanchy = new Entry("squanchy@closet.in");
        squanchy.payment("squanchy@paypal.com");

        Entry birdman = new Entry("birdman@love.in");
        birdman.payment("birdman@paypal.com");

        Entry morty = new Entry("morty@business.com");
        morty.payment("morty@paypal.com");

        this.sneaker.register(squanchy, birdman, morty);
        assertThat(this.sneaker.totalEntries()).isEqualTo(3);
    }
}
