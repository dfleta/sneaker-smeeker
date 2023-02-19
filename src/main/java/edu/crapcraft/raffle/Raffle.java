package edu.crapcraft.raffle;


public interface Raffle {

    void sizesRun(Sizes min, Sizes max);
    Double price();
    void register(Entry entry);
    public Integer totalEntries();

}