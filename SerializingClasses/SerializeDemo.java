package SerializingClasses;

import java.io.*;

public class SerializeDemo {
    public static void main(String[] args){

        //Creating an object of the employee class
        Employee dave = new Employee("dave", "Devops", "D@ve");

        try (
                FileOutputStream fileOut = new FileOutputStream("devs.ser");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                ){
            out.writeObject(dave);
            System.out.println("Serialized data saved in dave.ser");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
