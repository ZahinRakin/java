package Quiz;

import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Scanner;

public class SignIn {
    String username;
    String password;
    SignIn(){
        System.out.print("\n\nGive username : ");
        Scanner scanner = new Scanner(System.in);
        username = scanner.next();
        System.out.print("\n\nGive password : ");
        password = scanner.next();
        scanner.close();
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("Users.txt",true));
            writer.write("username: "+username+" ");
            writer.write("password: "+password+" ");
            writer.newLine();
            writer.close();
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
