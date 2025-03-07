import java.util.Scanner;
import java.util.ArrayList;
public class TaskManager {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hi, welcome to task manager! Enter your tasks and they will be displayed below.");

        ArrayList<String> tasks = new ArrayList<>();


        System.out.println("If you want to stop entering tasks just type in STOP.");
        System.out.println("If you want to remove a task, type in REM.");

        System.out.println("Enter your first task:");
            String userInput = keyboard.nextLine();
        tasks.add(userInput);

        while(!(userInput.equals("STOP"))){
            System.out.println("Enter another task:");
                userInput = keyboard.nextLine();
            if(userInput.equals("REM")){
                System.out.println("Which task do you wanna remove? (Give the number of the task, not index)");
                System.out.println(tasks);
                int userInt = keyboard.nextInt();
                keyboard.nextLine();
                tasks.remove(userInt-1);
            }else{
                tasks.add(userInput);

            }
        }

        tasks.remove(tasks.size()-1);
        System.out.println("All tasks: " + tasks);
        System.out.println("You have " + tasks.size() + " tasks");
    }
}
