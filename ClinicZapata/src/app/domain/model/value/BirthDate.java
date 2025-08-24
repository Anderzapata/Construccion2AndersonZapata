package app.domain.model.value;

public class BirthDate {
    private final String value;
    public BirthDate(String value) {
        if (value == null || value.length() != 10) throw new IllegalArgumentException("invalid birthDate");
        this.value = value;
    }
    public String getValue() { 
        return value; 
    }
    @Override public String toString() { 
        return value; 
    }
}
