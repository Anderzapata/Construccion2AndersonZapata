package app.domain.repository;

import app.domain.model.ClinicalRecord;
import java.util.List;

public interface ClinicalRecordRepository {
    void upsert(String patientIdCard, ClinicalRecord record);
    List<ClinicalRecord> findAll(String patientIdCard);
}
