//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class QuizMain {
    public static void main(String[] args0){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please pick a difficulty (enter 1 for easy, 2 for medium, 3 for hard)");
        int input = keyboard.nextInt();
        int correctAmount = 0;
        // will store all the questions and then display them in this arraylist
        ArrayList<QuizQuestion> questions = new ArrayList<>();
        // checks for what difficulty they inputted
        if(input == 1){
            System.out.println("Type 1, 2, 3, or 4 for answer");
            ArrayList<String> option1 = new ArrayList<>();
            option1.add("Portland");
            option1.add("Bend");
            option1.add("Salem");
            option1.add("Eugene");
            questions.add(new QuizQuestion("What is the largest city in Oregon?", option1, 0));
            ArrayList<String> option2 = new ArrayList<>();
            option2.add("Mr. Harpster");
            option2.add("Ms. Shelby");
            option2.add("Mr. Coombs");
            option2.add("DJ OnlyChild");
            questions.add(new QuizQuestion("Who teaches AP CSA at McDaniel?", option2, 2));
            ArrayList<String> option3 = new ArrayList<>();
            option3.add("AP CSA");
            option3.add("CS 5-6");
            option3.add("AP Cybersecurity");
            option3.add("AP CSP");
            questions.add(new QuizQuestion("What is the highest level coding class at McDaniel?", option3, 2));
            ArrayList<String> option4 = new ArrayList<>();
            option4.add("Graham");
            option4.add("Valve");
            option4.add("Tory");
            option4.add("Mr. Coombs");
            questions.add(new QuizQuestion("Who made this program?", option4, 0));
            Collections.shuffle(questions);
            // goes through each index and displays them and the answers
            for(int i = 0; i<4; i++) {
                System.out.println(questions.get(i).questionText);
                System.out.println(questions.get(i).options);
                int ans1 = keyboard.nextInt();
                if (ans1 - 1 == questions.get(i).correctAnswerIndex) {
                    correctAmount++;
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is number " + (questions.get(i).correctAnswerIndex + 1));
                }
            }
            System.out.println("You got " + correctAmount + " questions correct");
            // does this if they choose medium
        } else if(input == 2){
            ArrayList<String> option1 = new ArrayList<>();
            option1.add("Obama");
            option1.add("The Gunch");
            option1.add("Gerald Ford");
            option1.add("Joe Biden");
            questions.add(new QuizQuestion("Who was elected as US president in 2012?", option1, 0));
            ArrayList<String> option2 = new ArrayList<>();
            option2.add("Washington, DC");
            option2.add("Austin, Texas");
            option2.add("Portland, Oregon");
            option2.add("Nebraska");
            questions.add(new QuizQuestion("What is the capital of the US?", option2, 0));
            ArrayList<String> option3 = new ArrayList<>();
            option3.add("0.6");
            option3.add("36");
            option3.add("216");
            option3.add("1296");
            questions.add(new QuizQuestion("What is 6^4?", option3, 3));
            ArrayList<String> option4 = new ArrayList<>();
            option4.add("Tory");
            option4.add("The guy from Hitman");
            option4.add("Luigi Mangione (The GOAT)");
            option4.add("Barack Obama");
            questions.add(new QuizQuestion("Who shot Brian Thompson?", option4, 2));
            Collections.shuffle(questions);
            for(int i = 0; i<4; i++) {
                System.out.println(questions.get(i).questionText);
                System.out.println(questions.get(i).options);
                int ans1 = keyboard.nextInt();
                if (ans1 - 1 == questions.get(i).correctAnswerIndex) {
                    correctAmount++;
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is number " + (questions.get(i).correctAnswerIndex + 1));
                }
            }
            System.out.println("You got " + correctAmount + " questions correct");
            // does this if they choose hard
        } else if(input == 3){
            ArrayList<String> option1 = new ArrayList<>();
            option1.add("Kisanagi");
            option1.add("Buenos Aires");
            option1.add("Tunis");
            option1.add("Juba");
            questions.add(new QuizQuestion("What is the capital of Argentina?", option1, 1));
            ArrayList<String> option2 = new ArrayList<>();
            option2.add("X = 1");
            option2.add("X = -3");
            option2.add("X = 7");
            option2.add("No Solution");
            questions.add(new QuizQuestion("Find X: 7 - (2x + 5)^2 = 42", option2, 0));
            ArrayList<String> option3 = new ArrayList<>();
            option3.add("-10");
            option3.add("-12");
            option3.add("-24");
            option3.add("-15");
            questions.add(new QuizQuestion("What is the frame advantage of Lee's D3 on block in Tekken 8?", option3, 3));
            ArrayList<String> option4 = new ArrayList<>();
            option4.add("-4(2x + 3)^2/3x^3 + 4x");
            option4.add("2x^2 - 6x + 7/4x^2 + 8x - 7");
            option4.add("4(8x - 3)(7x + 1)/8x - 6");
            option4.add("7x(8x - 9)/(4x + 1)(3x - 3)");
            questions.add(new QuizQuestion("Which of these rationals has an oblique asymptote?", option4, 2));
            Collections.shuffle(questions);
            for(int i = 0; i<4; i++) {
                System.out.println(questions.get(i).questionText);
                System.out.println(questions.get(i).options);
                int ans1 = keyboard.nextInt();
                if (ans1 - 1 == questions.get(i).correctAnswerIndex) {
                    correctAmount++;
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The correct answer is number " + (questions.get(i).correctAnswerIndex + 1));
                }
            }
            System.out.println("You got " + correctAmount + " questions correct");
            // for if they dont input 1, 2 or 3
        } else{
            System.out.println("Please enter a valid difficulty");
        }
    }
}