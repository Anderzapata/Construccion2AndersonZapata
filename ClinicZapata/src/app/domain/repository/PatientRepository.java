package app.domain.repository;

import app.domain.model.Patient;
import java.util.Optional;

public interface PatientRepository {
    void save(Patient patient);
    Optional<Patient> findByPatientId(String patientId);
    Optional<Patient> findByIdCard(String idCard);
    String nextPatientId();
}
