import java.util.*;
import java.util.Scanner;

public class SpaceTraveSimulator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String[]> astronautList = new ArrayList<>();

        System.out.println("Choose an option:");
        System.out.println("1. Add astronaut to a mission");
        System.out.println("2. Update astronaut's mission status");
        System.out.println("3. Display all astronauts");
        System.out.println("4. Exit");

        //Let us create a while loop to keep the game running until the user hits exit
        boolean running = true;

        while (running) {

            System.out.println("Enter your choice: ");
            int choice1 = scanner.nextInt();
            scanner.nextLine();

            if (choice1 == 1) {
                System.out.print("Enter astronaut's name: ");
                String astronautName = scanner.nextLine();
                System.out.print("Enter astronaut's age: ");
                String age = scanner.nextLine();
                System.out.print("Enter mission status (On mission / Available): ");
                String status = scanner.nextLine();

                String[] data = {astronautName, age, status};
                astronautList.add(data);

                System.out.println(astronautName+ " added to the mission.");

            } else if (choice1 == 2) {
                System.out.print("Enter astronaut's name to update status: ");
                String name = scanner.nextLine();
                System.out.print("Enter new mission status (On status / Available): ");
                String mission = scanner.nextLine();
                for (String[] astronaut: astronautList){
                    for (int i=0; i<astronaut.length;i++){
                        if (astronaut[i].equalsIgnoreCase(name)) {
                            astronaut[2] = mission;
                            break;
                        }
                    }
                }
            } else if (choice1 == 3) {
                System.out.println("All astronauts:");
                for (String[] astronaut: astronautList){
                    System.out.printf("Name: %s, Age: %s, Status: %s: ", astronaut[0], astronaut[1], astronaut[2]);
                    System.out.println();
                }
            } else {
                running = false;
                System.out.println("Hope to see you again soon. Bye!");
            }
        }
    }
}
