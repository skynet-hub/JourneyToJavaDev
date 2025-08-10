package SerializingClasses;

import java.io.*;

public class DeserializeDemo implements Serializable {

    public static void main(String[] args){
        Employee developer = null;

        try (
                FileInputStream inputFile = new FileInputStream("devs.ser");
                ObjectInput input = new ObjectInputStream(inputFile);
                ){
            developer = (Employee) input.readObject();
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

        //Display the state of the unserialized Object
        System.out.println("Deserialized Object.......");
        System.out.println(developer);
    }

}
