package Quiz;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Users {
    public static void main(String []args){
        try{
            String fileName = "Quiz.txt";
            File file = new File(fileName);
            if(!file.exists()){
                System.out.println("file doesn't exits.so a new file was created.");
                if(file.createNewFile()){
                    System.out.println("file creation was successful");
                }
                else{
                    System.out.println("file creation wasn't successful.");
                }
            }
            FileReader fileReader = new FileReader(fileName);
            int asciiValue = 0;
            while((asciiValue = fileReader.read()) != -1){
                System.out.print((char)asciiValue);
            }
            fileReader.close();
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
