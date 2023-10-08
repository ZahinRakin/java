import java.io.IOException;
import java.io.File;


public class FileCreation1 {
    public static void main(String []args){
        try{
            String fileName = "example.txt";
            File file = new File(fileName);
            if(file.exists()){
                System.out.println("file already exists.");
            }
            else{
                if(file.createNewFile()){
                    System.out.println("file created successfully.");
                }
                else{
                    System.out.println("file couldn't be created.");
                }
            }
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
