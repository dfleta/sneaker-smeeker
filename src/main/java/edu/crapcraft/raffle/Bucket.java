package edu.crapcraft.raffle;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

class Bucket {

    private final Set<Entry> entries = new HashSet<Entry>();
    private Random rand = new Random();

    Bucket() {}; 

    void add(Entry entry) {
        if (!this.isDoubleEntry(entry)) {
            entries.add(entry);
        } 
    }

    void delete(Entry... entry) {
        this.entries.removeAll(Arrays.asList(entry));
    }

    Integer totalEntries() {
        return this.entries.size();
    }

    String listEntries() {
        return this.entries.stream().map(Entry::email).collect(Collectors.toList()).toString();
    }

    Optional<Entry> draw() {
        return this.entries.stream().skip(rand.nextInt(entries.size())).findFirst();
    } 

    private boolean isDoubleEntry(Entry entry) {
        return this.entries.stream().anyMatch(e -> e.payment().equalsIgnoreCase(entry.payment()));
    }
    
}
