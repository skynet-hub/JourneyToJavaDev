package dev.magobo.PersonalExpenseTracker.controller;

import dev.magobo.PersonalExpenseTracker.model.Expense;
import dev.magobo.PersonalExpenseTracker.utils.ExpenseDataLoader;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ExpenseController {
    /**
     * Get all expenses
     *
     * @param date the date in YYYY-MM-DD format.
     * @return List of expenses matching the date
     */

    @GetMapping("/expenses/day/{date}")
    public List<Expense> getExpenseByDay(@PathVariable String date){
        return ExpenseDataLoader.getExpenses().stream().filter(e -> e.getDate().equals(date))
                .collect(Collectors.toList());
    }

    /**
     *
     * Get all expenses for a particular category in a given month.
     *
     * @param category The Category of the expense (case-insensitive
     * @param month The month in YYYY-MM format.
     * @return List of expenses matching category and month.
     */

    @GetMapping("/expenses/category/{category}/month")
    public List<Expense> getExpenseByCategoryAndMonth(@PathVariable String category,
                                                       @RequestParam String month) {
        return ExpenseDataLoader.getExpenses().stream().filter(e -> e.getCategory().equalsIgnoreCase(category)
        && e.getDate().startsWith(month)).collect(Collectors.toList());
    }

    /**
     * Get all available expense categories
     *
     * @return List of distinct categories
     */

    @GetMapping("/expenses/categories")
    public List<String> getAllExpenseCategories(){
        return ExpenseDataLoader.getExpenses().stream()
                .map(Expense::getCategory)
                .distinct()
                .collect(Collectors.toList());
    }

}
