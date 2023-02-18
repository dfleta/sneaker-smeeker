package edu.crapcraft.raffle;

public class Entry {

    private String email = "";
    private String userName = "";
    private Sizes size;
    private String address = "";
    private Double total = 0d;
    private String payment = "";

    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setSize(Sizes size) {
        this.size = size;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Entry(String email) {
        this.email = email;
    };

    public void setTotal(Double total) {
        this.total = total;
    }

    public void payment(String system) {
        this.payment = system;
    }

    @Override
    public String toString() {
        StringBuilder repr = new StringBuilder();
        repr.append("\n\t\t")
            .append("email: " + email)
            .append("\n\t\t")
            .append("Size: " + size)
            .append("\n\t\t")
            .append("Address: " + address)
            .append("\n\t\t")
            .append("Payment: " + payment)
            .append("\n\t\t")
            .append("Total: " + String.format("%.2f", total))
            .append(" €");
        return repr.toString();
    }
}
