package dev.magobo.PersonalExpenseTracker.utils;

import dev.magobo.PersonalExpenseTracker.model.Expense;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import org.springframework.stereotype.Component;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.util.List;

@Component
public class ExpenseDataLoader {
    @Getter
    private static List<Expense> expenses;

    @PostConstruct
    public void init(){
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream is = getClass().getResourceAsStream("/expenses.json");
            expenses = mapper.readValue(is, new TypeReference<List<Expense>>() {});
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
