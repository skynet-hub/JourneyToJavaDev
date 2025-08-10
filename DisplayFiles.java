import java.io.File;

public class DisplayFiles {

    public static void main(String[] args){
        String path = "./PasswordValidator";
        File file = new File(path);

        File[] files = file.listFiles();

        if (files != null && files.length > 0){
            for (File f: files){
                System.out.println(f.getName());
            }
        }
    }
}
