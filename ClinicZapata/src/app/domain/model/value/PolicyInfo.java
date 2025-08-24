package app.domain.model.value;

public class PolicyInfo {
    private final String number;
    private final String status;
    private final String validity; 

    public PolicyInfo(String number, String status, String validity) {
        if (number == null || number.trim().isEmpty()) throw new IllegalArgumentException("policy number required");
        if (status == null || status.trim().isEmpty()) throw new IllegalArgumentException("policy status required");
        if (validity == null || validity.trim().isEmpty()) throw new IllegalArgumentException("policy validity required");
        this.number = number.trim();
        this.status = status.trim();
        this.validity = validity.trim();
    }

    public String getNumber() {
        return number; 
    }
    public String getStatus() { 
        return status; 
    }
    public String getValidity() { 
        return validity; 
    }
}
