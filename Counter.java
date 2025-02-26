import java.util.Scanner;

public class Counter {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word, phrase, sentence or paragraph..");
        String input = scanner.nextLine();

        int vowelCount = 0, ConsonantCount=0;       
        
        String vowels = "aeiouAEIOU";

        for (int i=0; i<input.length(); i++) {
            char c = input.charAt(i);

            System.out.println("Do you wish to continue, type (yes to continue, no to exit)");
            String ans = scanner.nextLine();

            if (ans.equalsIgnoreCase("no")) {
                break;
            }

            if (!Character.isLetter(c)) {
                continue;
            }

            if (vowels.indexOf(c) != -1) {
                vowelCount++;
            } else {
                ConsonantCount++;
            }
        }

        System.out.println();
        System.out.printf("Vowels count is: %d\n", vowelCount);
        System.out.printf("Consonant count is: %d", ConsonantCount);
        scanner.close();
    }  
}  
