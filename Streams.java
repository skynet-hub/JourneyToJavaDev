import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Streams {
    public static void main(String[] args){
        byte[] data = {72, 101, 108, 108, 111};

        ByteArrayInputStream inputStream = null;

        try{
            inputStream = new ByteArrayInputStream(data);
            int byteData;
            while ((byteData = inputStream.read()) != -1){ //When it hits -1 it means there's no data anymore and so we close the connection
                System.out.print((char) byteData);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
