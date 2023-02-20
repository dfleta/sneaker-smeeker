package edu.crapcraft.raffle;

import java.util.HashSet;
import java.util.Set;

public class Bucket {

    private Set<Entry> entries = new HashSet<Entry>();

    void add(Entry entry) {
        if (!this.isDoubleEntry(entry)) {
            entries.add(entry);
        } 
    }

    Integer totalEntries() {
        return this.entries.size();
    }

    private boolean isDoubleEntry(Entry entry) {
        return this.entries.stream().anyMatch(e -> e.getPayment().equalsIgnoreCase(entry.getPayment()));
    }
    
}
