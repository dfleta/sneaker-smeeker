package edu.crapcraft.raffle;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

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

    String listEntries() {
        return this.entries.stream().map(Entry::email).collect(Collectors.toList()).toString();
    }

    private boolean isDoubleEntry(Entry entry) {
        return this.entries.stream().anyMatch(e -> e.payment().equalsIgnoreCase(entry.payment()));
    }
    
}
