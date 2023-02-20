package edu.crapcraft.raffle;

public class Entry {

    private String email = "";
    private String userName = "";
    private Sizes size;
    private String address = "";
    private Double total = 0d;
    private String payment = "";

    public Entry(String email) {
        this.email = email;
    };
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setSize(Sizes size) {
        this.size = size;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public void payment(String system) {
        this.payment = system;
    }

    String email() {
        return this.email;
    }

    String payment() {
        return this.payment;
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

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Entry) {
            return this.email.equals(((Entry)obj).email) || this.payment.equals(((Entry)obj).payment);
        }
        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        return result;
    }
    
}
