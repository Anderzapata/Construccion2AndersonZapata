package app.domain.model;

import app.domain.model.enums.Gender;
import app.domain.model.value.*;

public class Patient extends Person {
    private Gender gender;
    private String patientId;
    private String emergencyContactName;
    private PolicyInfo policy;

    public Gender getGender() { 
        return gender; 
    }
    public void setGender(Gender gender) { 
        this.gender = gender; 
    }

    public String getPatientId() { 
        return patientId; 
    }
    public void setPatientId(String patientId) {
        if (patientId == null || patientId.trim().isEmpty()) throw new IllegalArgumentException("patientId required");
        this.patientId = patientId.trim();
    }

    public String getEmergencyContactName() { 
        return emergencyContactName; 
    }
    public void setEmergencyContactName(String emergencyContactName) {
        if (emergencyContactName == null || emergencyContactName.trim().isEmpty()) throw new IllegalArgumentException("emergency contact required");
        this.emergencyContactName = emergencyContactName.trim();
    }

    public PolicyInfo getPolicy() { 
        return policy; 
    }
    public void setPolicy(PolicyInfo policy) { 
        this.policy = policy; 
    }
}
