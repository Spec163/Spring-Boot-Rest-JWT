package com.billing.system.repository;

import com.billing.system.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// existsBy... OR findBy... добавил поиск по номеру

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

    // Для поиска по номерам в CRM!
    Boolean findByPhone(String phone);
}
