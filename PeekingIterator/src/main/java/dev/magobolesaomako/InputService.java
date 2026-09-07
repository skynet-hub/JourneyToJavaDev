package dev.magobolesaomako;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class InputService {

    public List<Integer> collectInput() {
        List<Integer> userList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers for the list (type 'done' to finish!):");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("done")){
                break;
            }

            try{
                userList.add(Integer.parseInt(input));
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number!");
            }
        }
        return userList;
    }
}
