package LearningInterfaces;

public interface InterfaceName {
    //Interfaces can have constants(already public,static, and final) => Immutability
    int CONST = 10;

    //We can also have abstract methods
    void methodName();

    //We can also have default methods
    default void defaultMethod(){
        System.out.println("Default Implementation");
    }

    //Can have static methods
    static void staticMethod(){
        System.out.println("Static Implementation");
    }
}
