package app.domain.model.value;

import java.util.regex.Pattern;

public class Email {
    private static final Pattern PATTERN = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    private final String value;
    public Email(String value) {
        if (value == null || !PATTERN.matcher(value).matches()) throw new IllegalArgumentException("invalid email");
        this.value = value;
    }
    public String getValue() { 
        return value; 
    }
    @Override public String toString() {
        return value; 
    }
}
