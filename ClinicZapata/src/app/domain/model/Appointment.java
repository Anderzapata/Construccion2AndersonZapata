package app.domain.model;

public class Appointment {
    private String appointmentId;
    private String patientId;
    private String doctorIdCard;
    private String dateTime;

    public String getAppointmentId() { 
        return appointmentId; 
    }
    public void setAppointmentId(String appointmentId) { 
        this.appointmentId = appointmentId;
    }

    public String getPatientId() { 
        return patientId; 
    }
    public void setPatientId(String patientId) { 
        this.patientId = patientId; 
    }

    public String getDoctorIdCard() { 
        return doctorIdCard;
    }
    public void setDoctorIdCard(String doctorIdCard) {
        this.doctorIdCard = doctorIdCard; 
    }

    public String getDateTime() { 
        return dateTime; 
    }
    public void setDateTime(String dateTime) { 
        this.dateTime = dateTime; 
    }
}
