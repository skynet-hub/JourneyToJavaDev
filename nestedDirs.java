import java.io.File;

public class nestedDirs {
    public static void main(String[] args){

        //Starting off with creating just one directory
        String path = "./file/dir1/dir2";

        File file = new File(path);

        if (!file.exists()){
            if (file.mkdirs()){
                System.out.println("Directories created successfully!");
            } else {
                System.out.println("Error creating directories");
            }
        } else {
            System.out.println("Directories already exist");
        }

    }
}
