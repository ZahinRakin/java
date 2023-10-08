import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class FileReading1 {
    public static void main(String []args){
        try{
            String fileName = "example.txt";
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
        
    }
}
