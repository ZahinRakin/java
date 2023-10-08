import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class FileWriting1 {
    public static void main(String []args){
        try{
            String fileName = "example.txt";
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));
            writer.write("\nHello, worl.");
            writer.flush();
            writer.close();
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
