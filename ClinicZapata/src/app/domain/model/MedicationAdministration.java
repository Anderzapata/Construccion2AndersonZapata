package app.domain.model;

public class MedicationAdministration {
    private String patientId;
    private String nurseIdCard;
    private String medication;
    private String dosage;
    private String orderId;
    private String itemId;
    private String givenAt;

    public String getPatientId() { 
        return patientId; 
    }
    public void setPatientId(String patientId) { 
        this.patientId = patientId; 
    }

    public String getNurseIdCard() { 
        return nurseIdCard; 
    }
    public void setNurseIdCard(String nurseIdCard) { 
        this.nurseIdCard = nurseIdCard; 
    }

    public String getMedication() { 
        return medication; 
    }
    public void setMedication(String medication) { 
        this.medication = medication;
    }

    public String getDosage() { 
        return dosage;
    }
    public void setDosage(String dosage) { 
        this.dosage = dosage; 
    }

    public String getOrderId() { 
        return orderId; 
    }
    public void setOrderId(String orderId) { 
        this.orderId = orderId; 
    }

    public String getItemId() { 
        return itemId; 
    }
    public void setItemId(String itemId) {
        this.itemId = itemId; 
    }

    public String getGivenAt() {
        return givenAt; 
    }
    public void setGivenAt(String givenAt) { 
        this.givenAt = givenAt; 
    }
}
