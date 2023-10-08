package Quiz;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Scanner;

public class LogIn {
    private final String nameFile = "Users.txt";

    LogIn(){
        try{
            Scanner scanner = new Scanner(System.in);
            String username ;
            String password ;
            System.out.print("\n\nusername : ");
            username = scanner.next();

            System.out.print("\n\npassword : ");
            password = scanner.next();
            System.out.println("\n\n********************Questions********************");
            scanner.close();
            
            FileReader fileReader = new FileReader(nameFile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;


            while((line = reader.readLine()) != null){
                if(line.contains(username)){
                    int userNameEnd = line.indexOf("password: ")-1;
                    int passEnd = userNameEnd + 11;
                    String user = line.substring(10,userNameEnd);
                    String pass = line.substring(passEnd);
                    if(user.equals(username) && pass.equals(password)){
                        Quiz quiz = new Quiz();
                        quiz.takeQuiz();
                        break;
                    }
                    else{
                        System.out.print("\n\nusername or password is wrong!");
                        break;
                    }
                }
            }
            reader.close();
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
        
    }
}
