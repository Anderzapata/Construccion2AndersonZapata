package app.domain.model.value;

public class Username {
    private final String value;
    public Username(String value) {
        if (value == null || !value.matches("^[A-Za-z0-9]{1,15}$")) throw new IllegalArgumentException("invalid username");
        this.value = value;
    }
    public String getValue() { 
        return value; 
    }
    @Override public String toString() {
        return value; 
    }
}
