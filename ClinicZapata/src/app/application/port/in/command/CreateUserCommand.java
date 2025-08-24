package app.application.port.in.command;

import app.domain.model.enums.Role;

public class CreateUserCommand {
    public String idCard;
    public String fullName;
    public String email;
    public String phone;
    public String birthDate;
    public String address;
    public Role role;
    public String username;
    public String passwordHash;
}
