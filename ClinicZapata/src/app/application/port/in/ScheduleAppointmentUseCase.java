package app.application.port.in;

import app.application.port.in.command.ScheduleAppointmentCommand;

public interface ScheduleAppointmentUseCase {
    void scheduleAppointment(ScheduleAppointmentCommand command);
}
