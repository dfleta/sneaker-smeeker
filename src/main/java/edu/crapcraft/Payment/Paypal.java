package edu.crapcraft.Payment;

import java.util.HashMap;
import java.util.Map;

public class Paypal implements Payment {

    private Map<String, Double> users = new HashMap<String, Double>();

    public Paypal() {
        this.users.put("squanchy@paypal.com", 200d);
        this.users.put("birdman@paypal.com", 200d);
        this.users.put("morty@paypal.com", 200d);
        this.users.put("summer@paypal.com", 200d);
    }

    @Override
    public boolean autentication(String user) {
        return this.users.containsKey(user);
    }

    @Override
    public boolean pay(String user, Double total) {
        Double credit = this.users.get(user);
        if (credit - total >= 0) {
            this.users.compute(user,(k, v) -> v - total);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Double credit(String user) {
        return this.users.get(user);
    }    
}
