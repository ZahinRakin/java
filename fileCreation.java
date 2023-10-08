import java.io.File;
import java.io.IOException;

public class fileCreation {
    public static  void main(String []args){
        File file = new File("rakin.txt");
        try{
            if(file.exists()){
                System.out.println("the file already existsts.\n");
            }
            else{
                if(file.createNewFile()){
                    System.out.println("File created successfully.\n");
                }
                else {
                    System.out.println("can't create the file.\n");
                }
            }
        }
        catch(IOException ioe){
            System.err.println("an exception occured:\n"+ioe.getMessage());
        }
    }
}
