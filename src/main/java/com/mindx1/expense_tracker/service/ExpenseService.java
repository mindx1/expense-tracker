package com.mindx1.expense_tracker.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindx1.expense_tracker.entity.Expense;
import com.mindx1.expense_tracker.repository.ExpenseRepository;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public Expense saveExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }
    public Optional<Expense> getExpenseById(Long id) {
        return expenseRepository.findById(id);
    }
    public void deleteExpense(Long id) {
        expenseRepository.deleteById(id);
    }
}