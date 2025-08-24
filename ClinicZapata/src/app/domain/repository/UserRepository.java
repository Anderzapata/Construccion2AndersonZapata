package app.domain.repository;

import app.domain.model.User;
import java.util.Optional;

public interface UserRepository {
    void save(User user);
    Optional<User> findByUsername(String username);
    Optional<User> findByIdCard(String idCard);
    boolean usernameExists(String username);
    boolean idCardExists(String idCard);
    void deleteByIdCard(String idCard);
}
