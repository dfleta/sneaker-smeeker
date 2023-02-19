package edu.crapcraft.raffle;

import java.util.HashSet;
import java.util.Set;

public class Bucket {

    private Set<Entry> entries = new HashSet<Entry>();

    public void add(Entry entry) {
        // aqui firewall buscando paypal?
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
