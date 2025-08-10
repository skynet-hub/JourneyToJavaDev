package SerializingClasses;

import java.io.Serializable;

public class Employee implements Serializable {
    private static final long SerialVersionUID = 1L;

    //The fields to be serialized during serialization process
    private String name;
    private String department;

    //Password is sensitive hence ignored during the process of serialization
    transient String password;

    public Employee(String name, String department, String password){
        this.name = name;
        this.department = department;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nDepartment: " + department +
                "\nPassword: " + password; //This will be null after deserialization
    }
}
