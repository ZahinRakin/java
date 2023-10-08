package Quiz;

import java.util.Scanner;

public class Menu {
    public static void main(String []args){
        int choice = 0;
        System.out.println("\n\n\n********************Quiz********************");
        System.out.println("\n\n1 . Log In.");
        System.out.println("\n\n2 . Sign In.\n\n");
        System.out.print("Choose: ");
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        if(choice == 1){
            LogIn logIn = new LogIn();
        }
        else if(choice == 2){
            SignIn signIn = new SignIn();
        }
        else{
            System.out.println("\n\ninvalid choice.");
        }
        scanner.close();
    }
}
