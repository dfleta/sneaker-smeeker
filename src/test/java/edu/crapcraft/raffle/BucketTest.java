package edu.crapcraft.raffle;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class BucketTest {

    private Bucket bucket;

    @Before
    public void setup() {
        this.bucket = new Bucket();
    }

    @Test
    public void add_duplicate_entry_test() {
        Entry entry = new Entry("squanchy@closet.in");
        entry.setUserName("Squanchy");
        entry.setSize(Sizes.CUARENTA);
        entry.setAddress("Nearest closet s/n, 90210, Jerry's House, Via Lactea");
        entry.setTotal(109.99);
        entry.payment("squanchy@paypal.com");

        bucket.add(entry);
        assertThat(bucket.totalEntries()).isEqualTo(1);

        Entry other = new Entry("squanchy@closet.in");
        other.payment("squan.chy@paypal.com");

        bucket.add(other);
        assertThat(bucket.totalEntries()).isEqualTo(1);

        other = new Entry("squan.chy@closet.in");
        other.payment("squanchy@paypal.com");

        bucket.add(other);
        assertThat(bucket.totalEntries()).isEqualTo(1);
    }
    
}
