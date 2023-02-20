package edu.crapcraft.raffle;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Bucket {

    private Set<Entry> entries = new HashSet<Entry>();
    private Random rand = new Random();

    public Bucket() {}; 

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

    Optional<Entry> draw() {
        //List<Entry> e = new ArrayList<Entry>();
        //e.addAll(this.entries);
        //int winner = this.rand.nextInt(e.size());
        // OPTIONAL
        //return List.of(e.get(winner));

        return this.entries.stream().skip(rand.nextInt(entries.size())).findFirst();
    } 

    private boolean isDoubleEntry(Entry entry) {
        return this.entries.stream().anyMatch(e -> e.payment().equalsIgnoreCase(entry.payment()));
    }
    
}
