package app.domain.model;

import app.domain.model.value.*;

public class Person {
    private IdCard idCard;
    private String fullName;
    private Email email;
    private PhoneNumber phone;
    private Address address;
    private BirthDate birthDate;

    public IdCard getIdCard() {
        return idCard; 
    }
    public void setIdCard(IdCard idCard) { 
        this.idCard = idCard; 
    }

    public String getFullName() { 
        return fullName; 
    }
    public void setFullName(String fullName) {
        if (fullName == null || fullName.trim().isEmpty()) throw new IllegalArgumentException("name required");
        this.fullName = fullName.trim();
    }

    public Email getEmail() { 
        return email;
    }
    public void setEmail(Email email) { 
        this.email = email; 
    }

    public PhoneNumber getPhone() { 
        return phone;
    }
    public void setPhone(PhoneNumber phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address; 
    }
    public void setAddress(Address address) { 
        this.address = address; 
    }

    public BirthDate getBirthDate() { 
        return birthDate; 
    }
    public void setBirthDate(BirthDate birthDate) { 
        this.birthDate = birthDate;
    }
}
