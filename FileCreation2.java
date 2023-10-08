import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreation2 {
    public static void main(String []args){
        try{
            String fileName = "example.txt";
            File file = new File(fileName);
            if(file.exists()){
                System.out.println("file already exists.");
            }
            else{
                FileWriter writer = new FileWriter(fileName);
                writer.write("Hello, world!");
                writer.close();
            }
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
