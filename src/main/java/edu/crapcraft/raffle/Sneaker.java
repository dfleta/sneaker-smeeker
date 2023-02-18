package edu.crapcraft.raffle;

import java.util.Arrays;

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
    public void register(Entry entry) {
        this.bucket.add(entry);
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
