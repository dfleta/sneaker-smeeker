package edu.crapcraft.raffle;

public interface Raffle {

    void sizesRun(Sizes min, Sizes max);
    Double price();
    void register(Entry... entry);
    Integer totalEntries();
    String listEntries();
    Entry draw();

}