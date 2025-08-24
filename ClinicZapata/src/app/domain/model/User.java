package app.domain.model;

import app.domain.model.enums.Role;
import app.domain.model.value.*;

public class User extends Person {
    private Username username;
    private PasswordHash passwordHash;
    private Role role;

    public Username getUsername() { 
        return username; 
    }
    public void setUsername(Username username) { 
        this.username = username; 
    }

    public PasswordHash getPasswordHash() { 
        return passwordHash; 
    }
    public void setPasswordHash(PasswordHash passwordHash) { 
        this.passwordHash = passwordHash;
    }

    public Role getRole() { 
        return role; 
    }
    public void setRole(Role role) { 
        this.role = role; 
    }
}
