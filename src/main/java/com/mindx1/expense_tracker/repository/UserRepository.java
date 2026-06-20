package com.mindx1.expense_tracker.repository;

import com.mindx1.expense_tracker.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}