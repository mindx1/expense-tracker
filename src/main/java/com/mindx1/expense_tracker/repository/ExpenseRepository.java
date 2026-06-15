package com.mindx1.expense_tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindx1.expense_tracker.entity.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}