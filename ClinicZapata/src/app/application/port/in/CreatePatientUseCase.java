package app.application.port.in;

import app.application.port.in.command.CreatePatientCommand;

public interface CreatePatientUseCase {
    void createPatient(CreatePatientCommand command);
}
