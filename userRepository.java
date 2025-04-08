package com.example.Bank_management_system.repository;

import com.example.Bank_management_system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends JpaRepository<User,Long> {
   Boolean existsByEmail(String email);
   Boolean existsByAccountNumber(String accountNumber);
   User findByAccountNumber(String accountNumber);
}
