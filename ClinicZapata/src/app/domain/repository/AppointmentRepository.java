package app.domain.repository;

import app.domain.model.Appointment;
import java.util.List;

public interface AppointmentRepository {
    void save(Appointment a);
    List<Appointment> findByPatient(String patientId);
}
