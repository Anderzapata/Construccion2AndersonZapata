package app.domain.model;

public class VitalSigns {
    private String patientId;
    private String nurseIdCard;
    private String bloodPressure;
    private double temperatureC;
    private int pulse;
    private int oxygenLevel;
    private String orderId;
    private String itemId;
    private String recordedAt;

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

    public String getBloodPressure() { 
        return bloodPressure;
    }
    public void setBloodPressure(String bloodPressure) { 
        this.bloodPressure = bloodPressure; 
    }

    public double getTemperatureC() { 
        return temperatureC; 
    }
    public void setTemperatureC(double temperatureC) { 
        this.temperatureC = temperatureC; 
    }

    public int getPulse() { 
        return pulse; 
    }
    public void setPulse(int pulse) {
        this.pulse = pulse; 
    }

    public int getOxygenLevel() { 
        return oxygenLevel; 
    }
    public void setOxygenLevel(int oxygenLevel) {
        this.oxygenLevel = oxygenLevel; 
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

    public String getRecordedAt() { 
        return recordedAt; 
    }
    public void setRecordedAt(String recordedAt) { 
        this.recordedAt = recordedAt; 
    }
}
