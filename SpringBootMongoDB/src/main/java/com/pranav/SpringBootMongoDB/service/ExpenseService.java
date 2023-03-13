package com.pranav.SpringBootMongoDB.service;

import com.pranav.SpringBootMongoDB.model.Expense;
import com.pranav.SpringBootMongoDB.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public void addExpense(Expense expense) {
        expenseRepository.insert(expense);
    }

    public void updateExpense(Expense expense) {
        Expense savedExpense = expenseRepository.findById(expense.getId())
                .orElseThrow(() -> new RuntimeException(String.format("Cannot find expense by Id %s", expense.getId())));
        savedExpense.setExpenseName(expense.getExpenseName());
        savedExpense.setExpenseAmount(expense.getExpenseAmount());
        savedExpense.setExpenseCategory(expense.getExpenseCategory());
        expenseRepository.save(savedExpense);
    }

    public void deleteExpense(String id) {
        expenseRepository.deleteById(id);
    }

    public List<Expense> getAllExpense() {
        return expenseRepository.findAll();

    }

    public Expense getExpenseByName(String name) {
        return expenseRepository.findByName(name)
                .orElseThrow(() -> new RuntimeException(String.format("Cannot find expense by Id %s", name)));
    }

}
