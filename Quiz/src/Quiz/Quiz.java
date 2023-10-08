package Quiz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.io.InputStreamReader;

public class Quiz {
    private List<Integer> answers = new ArrayList<>();
    private String fileName = "Quiz.txt";
    BufferedReader reader;
    public Quiz(){
        try{
            reader = new BufferedReader(new FileReader(fileName));
            String line;
            while((line = reader.readLine()) != null){
                if(!line.contains("ans")){
                    System.out.println(line);
                }
                else{
                    answers.add((int)(line.charAt(6) - '0'));
                }
            }
            System.out.println(answers);//experiment;
        }
        catch(IOException ioe){
            System.out.print("\n\n");
            ioe.printStackTrace();
        }
    }

    void takeQuiz(){
        int correctAns = 0;
        try{
            reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Answers: ");
            for(int i = 0; i < answers.size(); i++){
                Integer yourAns = Integer.parseInt(reader.readLine());
                if(answers.get(i).equals(yourAns)){
                    correctAns++;
                }
            }
            reader.close();
        }
        catch(NumberFormatException nfe){
            System.out.println("\n\n");
            nfe.printStackTrace();
        }
        catch(IOException ioe){
            System.out.println("\n\n");
            ioe.printStackTrace();
        }
        System.out.println("\n\nCorrect : " + correctAns);
    }
}
