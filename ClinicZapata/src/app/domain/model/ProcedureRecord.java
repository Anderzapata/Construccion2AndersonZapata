package app.domain.model;

public class ProcedureRecord {
    private String patientId;
    private String nurseIdCard;
    private String procedureName;
    private String orderId;
    private String itemId;
    private String performedAt;

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

    public String getProcedureName() { 
        return procedureName; 
    }
    public void setProcedureName(String procedureName) { 
        this.procedureName = procedureName;
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

    public String getPerformedAt() { 
        return performedAt; 
    }
    public void setPerformedAt(String performedAt) { 
        this.performedAt = performedAt; 
    }
}
