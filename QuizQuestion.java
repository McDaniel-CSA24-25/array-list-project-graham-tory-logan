import java.util.ArrayList;
public class QuizQuestion {
    public String questionText;
    // will add answers to an arraylist and put that arraylist in the constructor
    public ArrayList<String> options;
    int correctAnswerIndex;
    // default constructor bc why not
    public QuizQuestion(){
        questionText = "None";
        options = null;
        correctAnswerIndex = 0;
    }
    // this is the only constructor im gonna use
    public QuizQuestion(String a, ArrayList<String> b, int c){
        questionText = a;
        options = b;
        correctAnswerIndex = c;
    }
}
