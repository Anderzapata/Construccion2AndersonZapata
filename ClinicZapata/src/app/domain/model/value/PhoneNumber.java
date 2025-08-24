package app.domain.model.value;

public class PhoneNumber {
    private final String value;
    public PhoneNumber(String value) {
        if (value == null || !value.matches ("^\\d{1,10}$")) {
        throw new IllegalArgumentException("phone number must be 1 to 10 digist");
    }
       
        this.value = value;
    }
    public String getValue() { 
        return value; 
    }
    @Override public String toString() { 
        return value; 
    }
}
