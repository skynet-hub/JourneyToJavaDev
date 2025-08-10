import java.io.File;
import java.io.IOException;

public class Files {

    public static void main(String[] args){
        File file = new File("./newFile.txt");
        String filePath = "./changedFile.txt";

        if (file.exists()){
            System.out.println("File exists");
        } else {
            try {
                if (file.createNewFile()){
                    System.out.println("File created: " + file.getName());
                } else {
                    System.out.println("Failed to create a file");
                }
            } catch (IOException e){
                System.out.println("Error creating e new file....");
            }
        }

        File newfile = new File(filePath);
        if (file.renameTo(newfile)){
            System.out.println("Rename executed successfully!");
        } else {
            System.out.println("Renaming Failed.");
        }

        //Let us now focus on file deletion
        if (newfile.delete()){
            System.out.println("File deletion occurred successfully: " + newfile.getName());
        } else {
            System.out.println("Error occurred while trying to delete the file ");
        }
    }
}
