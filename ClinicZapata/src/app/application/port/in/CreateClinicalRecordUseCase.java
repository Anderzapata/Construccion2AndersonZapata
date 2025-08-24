package app.application.port.in;

import app.application.port.in.command.CreateClinicalRecordCommand;

public interface CreateClinicalRecordUseCase {
    void createClinicalRecord(CreateClinicalRecordCommand command);
}
