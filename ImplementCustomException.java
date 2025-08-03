public class ImplementCustomException {
    public static void main(String[] args){
        int x = -1;

        try{
            point(x);
        } catch (Exception e) {
            System.out.println("A coordinate of a point cannot be a negative");
        }

    }

    public static void point(int num) throws Exception{
        // This is known as propagation, not handling the exception instead moving it up the stack until a method which handles it is reached
        if (num < 0){
            throw new CustomException("A coordinate cannot be negative");
        }
    }
}
