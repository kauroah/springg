package ru.itis.springg.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.springg.models.User;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}