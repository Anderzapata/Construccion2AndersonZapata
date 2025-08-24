package app.application.port.in;

import app.application.port.in.command.CreateUserCommand;

public interface CreateUserUseCase {
    void createUser(CreateUserCommand command);
}
