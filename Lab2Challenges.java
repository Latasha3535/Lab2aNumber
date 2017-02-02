import java.util.Scanner;

/* Latasha Marks
 * Created by Student on 1/31/17.
 * Number Input Check to see is Even oand Odd
 * Challenges:
 */
public class Lab2Challenges {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int userInput = 1;
        String userName = " ";
        String choice = " y";

        do {
            System.out.println(" What is your Name :");
            userName = scnr.next();

            System.out.println("Enter a number");
            userInput = scnr.nextInt();

            if ((userInput % 2 != 0) && (userInput < 60)) {
                System.out.println("The number you enter: " + userName + " " + " Odd");
            } else if ((userInput % 2 == 0) && (userInput >= 2) && (userInput <= 25)) {
                System.out.println(userName + "  Even and less than 25");
            } else if ((userInput % 2 == 0) && (userInput >= 26) && (userInput <= 60)) {
                System.out.println(userName + " " + " It is Even");
            } else if ((userInput % 2 == 0) && (userInput >= 60) && (userInput <= 100)) {
                System.out.println(userName + " " + "The number enter is Even");
            } else if ((userInput % 2 == 1) && (userInput >= 60) && (userInput <= 100)) {
                System.out.println(userName + " " + "The numeber enter is Odd");
            }
               System.out.println("Enter y/n to Countine"); // Ask this user to input y/ or n
                choice = scnr.next();


        } while (choice.equals("y")) ;// Asking
            System.out.println("Done.");
        }

    }
