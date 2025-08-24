package app.domain.repository;

import java.util.Set;

public interface CatalogRepository {
    void addMedication(String name);
    void addProcedure(String name);
    void addDiagnosticAid(String name);
    Set<String> listMedications();
    Set<String> listProcedures();
    Set<String> listDiagnosticAids();
}
