import java.util.ArrayList;
import java.util.Scanner;

public class Inventory
{
    //local variables
    static Scanner keyboard = new Scanner(System.in);
    String name;
    String id;
    int quantity;
    double price;

    //constructor methods
    public Inventory()
    {
        name = null;
        price = 0.00;
    }
    public Inventory(String n, int q, double p)
    {
        name = n;
        id = n + String.valueOf(q);
        quantity = q;
        price = p;
    }

    //main method
    public static void main(String[] args)
    {
        ArrayList<Inventory> inventory = new ArrayList<Inventory>();

        //predefined items with 0 quantity
        inventory.add(new Inventory("Tissues", 1, 1.00));
        boolean endProgram = false;

        while (!endProgram)
        {
            String input = null;
            System.out.println("\nWhat would you like to do? \n (c) Create a new product for your inventory. \n (a) Add a specified amount of a product to your inventory. \n (r) Remove a specified amount of a product from your inventory. \n (u) Update the price of a product in your inventory. \n (l) List your product inventory.");
            System.out.println(" (e) End program.");
            input = keyboard.nextLine();
            while (!(input.equals("c") || input.equals("a") || input.equals("r") || input.equals("u") || input.equals("e") || input.equals("l")))
            {
                System.out.println("Invalid input.");
                input = keyboard.nextLine();
            }
            if (input.equals("a"))
            {
                System.out.println("Type 'exit' to cancel action.");
                System.out.println("List the product that you would like to increase the quantity of:");
                input = keyboard.nextLine();

                if (input.equals("exit"))
                {
                    System.out.println("Action canceled.");
                }
                else
                {
                    boolean productFound = false;
                    for (int i = 0; i < inventory.size(); i++) {
                        if (inventory.get(i).name.equals(input)) {
                            System.out.println("By how much should the quantity be changed? (can be + or -)");
                            int inputNum = keyboard.nextInt();
                            keyboard.nextLine();  // Consume the leftover newline character

                            inventory.set(i, new Inventory(inventory.get(i).name, inventory.get(i).quantity + inputNum, inventory.get(i).price));
                            productFound = true;
                            break;
                        }
                    }
                    if (!productFound) {
                        System.out.println("Could not find the product specified.");
                    }
                }
            }
            else if(input.equals("c"))
            {
                System.out.println("Type 'exit' to cancel action.");
                System.out.println("List the product that you would like to add to your inventory:");
                input = keyboard.nextLine();

                if (input.equals("exit"))
                {
                    System.out.println("Action canceled.");
                }
                else
                {
                    boolean productExists = false;
                    for (int i = 0; i < inventory.size(); i++) {
                        if (inventory.get(i).name.equals(input)) {
                            productExists = true;
                            System.out.println("Product already exists in your inventory.");
                            break;
                        }
                    }
                    if (!productExists) {
                        System.out.println("What is the price of the new product? Format: (#.##)");
                        double inputDouble = keyboard.nextDouble();
                        keyboard.nextLine();  // Consume the leftover newline character
                        System.out.println("How much quantity are you adding? (can be + or 0)");
                        int inputNum = keyboard.nextInt();
                        keyboard.nextLine();  // Consume the leftover newline character

                        inventory.add(new Inventory(input, inputNum, inputDouble));
                        System.out.println("Product successfully added to inventory.");
                    }
                }
            }
            else if (input.equals("r"))
            {
                System.out.println("Type 'exit' to cancel action.");
                System.out.println("List the product that you would like to remove an amount from your inventory:");
                input = keyboard.nextLine();

                if (input.equals("exit"))
                {
                    System.out.println("Action canceled.");
                }
                else
                {
                    boolean productFound = false;
                    for (int i = 0; i < inventory.size(); i++) {
                        if (inventory.get(i).name.equals(input)) {
                            System.out.println("How much quantity are you removing? (can be +)");
                            int inputNum = keyboard.nextInt();
                            keyboard.nextLine();  // Consume the leftover newline character

                            if (inventory.get(i).quantity >= inputNum) {
                                inventory.set(i, new Inventory(input, inventory.get(i).quantity - inputNum, inventory.get(i).price));
                                System.out.println("Quantity removed successfully.");
                            } else {
                                System.out.println("Not enough quantity in stock.");
                            }
                            productFound = true;
                            break;
                        }
                    }
                    if (!productFound) {
                        System.out.println("Product not found in your inventory.");
                    }
                }
            }
            else if (input.equals("u"))
            {
                System.out.println("Type 'exit' to cancel action.");
                System.out.println("List the product that you would like to update the price of in your inventory:");
                input = keyboard.nextLine();
                if (input.equals("exit"))
                {
                    System.out.println("Action canceled.");
                }
                else
                {
                    boolean productFound = false;
                    for (int i = 0; i < inventory.size(); i++) {
                        if (inventory.get(i).name.equals(input)) {
                            System.out.println("The current price is $" + inventory.get(i).price + ".");
                            System.out.println("What price do you want to change it to? (can be +) Format: (#.##)");
                            double inputNum = keyboard.nextDouble();
                            keyboard.nextLine();  // Consume the leftover newline character
                            inventory.set(i, new Inventory(inventory.get(i).name, inventory.get(i).quantity, inputNum));
                            System.out.println("Price of product successfully changed.");
                            productFound = true;
                            break;
                        }
                    }
                    if (!productFound) {
                        System.out.println("Product not found in your inventory.");
                    }
                }
            }
            else if (input.equals("e"))
            {
                System.out.println("Are you sure you want to exit the program? \n (y) Yes. \n (n) No.");
                input = keyboard.nextLine();

                if (input.equals("y"))
                {
                    endProgram = true;
                }
                else if (input.equals("n"))
                {
                    System.out.println("End program canceled.");
                }
                else
                {
                    System.out.println("Input invalid. End program canceled.");
                }
            }
            else if (input.equals("l"))
            {
                System.out.println("Your inventory:");
                for (int i = 0; i < inventory.size(); i++)
                {
                    System.out.println("  Product: " + inventory.get(i).name);
                    if (inventory.get(i).price < 1000)
                    {
                        System.out.println("  Price: $" + inventory.get(i).price);
                    }
                    else
                    {
                        System.out.print("  Price: $");
                        String value = String.valueOf(inventory.get(i).price);
                        for (int l = 0; l < value.length(); l++)
                        {
                            System.out.print(value.charAt(l));
                            if (l % 3 == 0)
                            {
                                System.out.print(",");
                            }
                        }
                    }
                    System.out.println("  Quantity in-stock: " + inventory.get(i).quantity);
                    if (!(i == inventory.size() - 1))
                    {
                        System.out.println("\n");
                    }
                }
            }
            else
            {
                System.out.println("Input invalid.");
            }
            input = null;
        }
    }
}