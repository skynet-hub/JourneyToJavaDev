package StudentManagement;

import java.util.Scanner;
import java.util.*;

public class StudentManagementSystem {
    public static void main(String[] args){
        List<Student> studentsObjects = new ArrayList<>();
        int avgHeight;
        Integer tallest = 0;
        Integer sumAge = 0;
        Integer sumHeight = 0;
        int avgAge;
        Integer oldest = 0;
        Scanner scanner = new Scanner(System.in);

        //Give the user a message
        System.out.println("How many students do you want to enter? ");
        int students = scanner.nextInt();

        //Loop the number of students time
        for (int i=1; i <=students; i++){
            System.out.println("Enter details for student " + i);

            System.out.print("Name: ");
            String name = scanner.nextLine();
            scanner.nextLine();

            System.out.print("Roll Number: ");
            Integer rollNumber = scanner.nextInt();

            System.out.print("Age: ");
            Integer age = scanner.nextInt();

            System.out.print("Height: ");
            Integer height = scanner.nextInt();

            Student student = new Student(name, rollNumber, age, height);
            studentsObjects.add(student);
        }

        for (Student student: studentsObjects){
            sumAge += student.age;
            sumHeight += student.height;

            if (student.height > tallest){
                tallest = student.height;
            }

            if (student.age > oldest){
                oldest = student.age;
            }

        }

        avgAge = sumAge / studentsObjects.size();
        avgHeight = sumHeight / studentsObjects.size();

        System.out.println("Average height of the class is: " + avgHeight);
        System.out.println("Average age of the class is: " + avgAge);
        System.out.println("The oldest student in the class is " + oldest + " years of age.");
        System.out.println("The tallest student in the class is " + tallest + " cm.");
    }
}
