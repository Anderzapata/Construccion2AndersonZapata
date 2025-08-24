package app.domain.model;

public class ClinicalRecord {
    private String patientIdCard;
    private String dateKey; 
    private String doctorIdCard;
    private String symptoms;
    private String diagnosis;
    private String treatments;
    private String testResults;
    private String prescriptions;
    private String notes;

    public String getPatientIdCard() {
        return patientIdCard;
    }
    public void setPatientIdCard(String patientIdCard) { 
        this.patientIdCard = patientIdCard; 
    }

    public String getDateKey() {
        return dateKey; 
    }
    public void setDateKey(String dateKey) {
        this.dateKey = dateKey; 
    }

    public String getDoctorIdCard() { 
        return doctorIdCard; 
    }
    public void setDoctorIdCard(String doctorIdCard) {
        if (doctorIdCard == null || !doctorIdCard.matches("^\\d{1,10}$")) throw new IllegalArgumentException("invalid doctor id");
        this.doctorIdCard = doctorIdCard;
    }

    public String getSymptoms() { 
        return symptoms;
    }
    public void setSymptoms(String symptoms) { 
        this.symptoms = symptoms; 
    }

    public String getDiagnosis() { 
        return diagnosis; 
    }
    public void setDiagnosis(String diagnosis) { 
        this.diagnosis = diagnosis; 
    }

    public String getTreatments() { 
        return treatments; 
    }
    public void setTreatments(String treatments) { 
        this.treatments = treatments;
    }

    public String getTestResults() { 
        return testResults; 
    }
    public void setTestResults(String testResults) { 
        this.testResults = testResults; 
    }

    public String getPrescriptions() { 
        return prescriptions; 
    }
    public void setPrescriptions(String prescriptions) { 
        this.prescriptions = prescriptions; 
    }

    public String getNotes() { 
        return notes; 
    }
    public void setNotes(String notes) {
        this.notes = notes; 
    }
}
