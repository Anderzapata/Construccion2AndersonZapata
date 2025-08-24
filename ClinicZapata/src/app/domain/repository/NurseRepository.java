package app.domain.repository;

import app.domain.model.VitalSigns;
import app.domain.model.MedicationAdministration;
import app.domain.model.ProcedureRecord;

public interface NurseRepository {
    void saveVitals(VitalSigns v);
    void saveMedication(MedicationAdministration m);
    void saveProcedure(ProcedureRecord p);
}
