import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest{
    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("rakin.txt"));
            String line = null;
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