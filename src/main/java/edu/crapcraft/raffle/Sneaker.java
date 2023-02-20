package edu.crapcraft.raffle;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Sneaker implements Raffle {

    private String style = "";
    private String name = "";
    private Double price = 0d;
    private String[] sizes; 
    private final Bucket bucket = new Bucket();

    public Sneaker() {};

    public Sneaker(String style, String name, Double price) {
        this.style = style;
        this.name = name;
        this.price = price;
    }

    @Override
    public Double price() {
        return this.price;
    }

    @Override
    public void sizesRun(Sizes min, Sizes max) {
        this.sizes = Sizes.getSizes(min, max).stream().map(Sizes::getUSsize).toArray(String[]::new);
    }

    String[] sizes() {
        return this.sizes;
    }

    @Override
    public void register(Entry... entry) {
        for (Entry e : entry) {
            this.bucket.add(e);
        }
    }

    @Override
    public void cancel(Entry... entry) {
            this.bucket.delete(entry);   
    }

    @Override
    public Integer totalEntries() {
        return this.bucket.totalEntries();
    }

    @Override
    public String listEntries() {
        return this.bucket.listEntries();
    }

    @Override
    public Entry draw() {
        Optional<Entry> winner = this.bucket.draw();
        return winner.orElse(new Entry());  
    }

    @Override
    public String toString() {
        StringBuilder repr = new StringBuilder();
        repr.append("\n\t\t")
            .append(style)
            .append("\n\t\t")
            .append(name)
            .append("\n\t\t")
            .append(String.format("%.2f", this.price))
            .append(" €")
            .append("\n\t\t")
            .append(Arrays.toString(this.sizes));
        return repr.toString();
    }
    
}
