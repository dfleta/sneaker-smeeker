package edu.crapcraft.Payment;

public interface Payment {

    boolean autentication(String user);
    boolean pay(String user, Double total);
    Double credit(String user);
    
}
