import java.io.FileWriter;
import java.io.IOException;

public class FileWriting2 {
    public static void main(String []args){
        try{
            String fileName = "example.txt";
            FileWriter writer = new FileWriter(fileName,true);
            writer.write("I am zahin abdullah rakin.\n");
            
            writer.flush();
            writer.close();
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
