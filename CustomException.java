public class CustomException extends Exception {
    //Exception is a checked exception, therefore when you throw this exception a throws must make part of the signature
    public CustomException(String message){
        super(message);
    }
}
