package app.domain.model.value;

public class IdCard {
    private final String value;
    public IdCard(String value) {
        if (value == null || !value.matches("^\\d{1,10}$")){
        throw new IllegalArgumentException("idCard must be 1 to 10 digits");
    }
               this.value = value;
    }
  
    public String getValue() { 
        return value; 
    }
    @Override public String toString() { 
        return value; 
    }
    @Override public int hashCode() { 
        return value.hashCode(); 
    }
    @Override public boolean equals(Object o) { 
        return (o instanceof IdCard) && ((IdCard)o).value.equals(this.value); 
    }
}
