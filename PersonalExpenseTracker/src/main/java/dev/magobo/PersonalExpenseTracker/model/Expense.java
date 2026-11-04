package dev.magobo.PersonalExpenseTracker.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Expense {
    @JsonProperty("expenseType")
    private int expenseType; // 1 for income, 0 for expense

    @JsonProperty("date")
    private String date; // format : YYYY-MM-DD

    @JsonProperty("amount")
    private double amount;

    @JsonProperty("category")
    private String category;

    @JsonProperty("account")
    private String account;

    @JsonProperty("note")
    private String note;
}
