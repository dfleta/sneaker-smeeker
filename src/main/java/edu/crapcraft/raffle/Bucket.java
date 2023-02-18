package edu.crapcraft.raffle;

import java.util.HashSet;
import java.util.Set;

public class Bucket {

    private Set<Entry> entries = new HashSet<Entry>();

    public void add(Entry entry) {
        entries.add(entry);
    }

    Integer totalEntries() {
        return this.entries.size();
    }
    
}
