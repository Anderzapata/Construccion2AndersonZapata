package app.application.port.in.command;

import app.domain.model.enums.Gender;

public class CreatePatientCommand {
    public String idCard;
    public String fullName;
    public String birthDate;
    public Gender gender;
    public String address;
    public String phone;
    public String email;
    public String emergencyContactName;
    public String policyNumber;
    public String policyStatus;
    public String policyValidity;
}
