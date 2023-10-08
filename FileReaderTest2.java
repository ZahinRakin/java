import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest2{
    public static void main(String[] args) {
        try{
            FileReader reader = new FileReader("rakin.txt");
            int data;
            while((data = reader.read()) != -1){
                System.out.print((char)data);
            }
            reader.close();
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
        
    }
}