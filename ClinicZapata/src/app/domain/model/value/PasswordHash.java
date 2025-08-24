package app.domain.model.value;

public class PasswordHash {
    private final String value;
    public PasswordHash(String value) {
        if (value == null || value.length() < 8) throw new IllegalArgumentException("weak password hash");
        this.value = value;
    }
    public String getValue() { 
        return value; 
    }
    @Override public String toString() { 
        return value; 
    }
}
