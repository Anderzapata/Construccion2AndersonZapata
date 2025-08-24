package app.domain.model.value;

public class Address {
    private final String value;
    
    public Address(String value) {
        if (value == null) throw new IllegalArgumentException("address required");
        String t = value.trim();
        if (t.isEmpty() || t.length() > 120) throw new IllegalArgumentException("invalid address");
        this.value = t;
    }
    public String getValue() {
        return value; 
    }
    @Override public String toString() { 
        return value; 
    }
}
