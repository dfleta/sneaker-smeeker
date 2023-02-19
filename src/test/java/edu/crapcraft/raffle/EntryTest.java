package edu.crapcraft.raffle;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class EntryTest {

    private static Entry entry;

    @BeforeClass
    public static void setup_test() {
        entry = new Entry("squanchy@closet.in");
        entry.setUserName("Squanchy");
        entry.setSize(Sizes.CUARENTA);
        entry.setAddress("Nearest closet s/n, 90210, Jerry's House, Via Lactea");
        entry.setTotal(109.99);
        entry.payment("squanchy@paypal.com");
    }

    @Test
    public void test_equals() {
        Entry other = new Entry("squanchy@closet.in");
        other.setUserName("Squanchy");
        other.setSize(Sizes.CUARENTA);
        other.setAddress("Nearest closet s/n, 90210, Jerry's House, Via Lactea");
        other.setTotal(109.99);
        other.payment("squanchy@paypal.com");

        assertEquals(entry, other);
    }

    @Test
    public void test_equals_email() {
        Entry other = new Entry("squanchy@closet.in");
        other.setUserName("Squanchy");
        other.setSize(Sizes.CUARENTA);
        other.setAddress("Nearest closet s/n, 90210, Jerry's House, Via Lactea");
        other.setTotal(109.99);
        other.payment("squan.chy@paypal.com");

        assertEquals(entry, other);
    }

    @Test
    public void test_equals_payment() {
        Entry other = new Entry("squan.chy@closet.in");
        other.setUserName("Squanchy");
        other.setSize(Sizes.CUARENTA);
        other.setAddress("Nearest closet s/n, 90210, Jerry's House, Via Lactea");
        other.setTotal(109.99);
        other.payment("squanchy@paypal.com");

        assertEquals(entry, other);
    }


    @Test
    public void test_not_equals() {
        Entry other = new Entry("squan.chy@closet.in");
        other.setUserName("Squanchy");
        other.setSize(Sizes.CUARENTA);
        other.setAddress("Nearest closet s/n, 90210, Jerry's House, Via Lactea");
        other.setTotal(109.99);
        other.payment("squan.chy@paypal.com");

        assertNotEquals(entry, other);
    }
}
