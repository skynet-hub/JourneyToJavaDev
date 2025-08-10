import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class OutputStreams {

    public static void main(String[] args){
        String str = "Hello I am learning to make use of output streams!!!";

        try (FileOutputStream fileOs = new FileOutputStream("./output.txt")){
            fileOs.write(str.getBytes());
            fileOs.flush();
        } catch (IOException e){
            e.printStackTrace();
        } catch (RuntimeException e){
            System.out.println("An unchecked exception happened");
        }
    }

}
