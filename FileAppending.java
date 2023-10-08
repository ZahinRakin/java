import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class FileAppending {
    public static void main(String[] args){
        try{
            String fileName = "example.txt";
            FileWriter fileWriter = new FileWriter(fileName,true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.write("hello world");
            writer.newLine();
            writer.flush();
            writer.close();
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
