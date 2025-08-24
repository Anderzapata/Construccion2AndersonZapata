package app.domain.model;

public class BillingInfo {
    private String patientName;
    private int age;
    private String idCard;
    private String doctorName;
    private String insurer;
    private String policyNumber;
    private int policyDaysLeft;
    private String policyEndDate;

    public String getPatientName() { 
        return patientName; 
    }
    public void setPatientName(String patientName) { 
        this.patientName = patientName;
    }

    public int getAge() {
        return age; 
    }
    public void setAge(int age) { 
        this.age = age; 
    }

    public String getIdCard() { 
        return idCard; 
    }
    public void setIdCard(String idCard) { 
        this.idCard = idCard; 
    }

    public String getDoctorName() { 
        return doctorName; 
    }
    public void setDoctorName(String doctorName) { 
        this.doctorName = doctorName; 
    }

    public String getInsurer() { 
        return insurer; 
    }
    public void setInsurer(String insurer) { 
        this.insurer = insurer;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }
    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber; 
    }

    public int getPolicyDaysLeft() { 
        return policyDaysLeft; 
    }
    public void setPolicyDaysLeft(int policyDaysLeft) {
        this.policyDaysLeft = policyDaysLeft; 
    }

    public String getPolicyEndDate() { 
        return policyEndDate; 
    }
    public void setPolicyEndDate(String policyEndDate) { 
        this.policyEndDate = policyEndDate; 
    }
}
