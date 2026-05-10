/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        // Create a Scanner object to track input data
        Scanner input = new Scanner(System.in);
    
        // This array will store 3 test scores entered by user
        double[] scores = new double[3];
    
        // This variable stores the total of all 3 scores
        double total = 0;
        
        // Try the program again
        boolean tryAgain = true;
    
        while(tryAgain) {
            // This loop will ask the user to enter 3 valid scores
            for (int i = 0; i < scores.length; i++) {
                boolean validScore = false;
        
                // This while loop will keep asking unitl the user enters valid number(0 to 100)
                while (!validScore) {
                    System.out.print("Please Enter score " + (i + 1) + " between 0 and 100: ");        
            
                    //Check if the user entered a number
                    if (input.hasNextDouble()) {
                        double score = input.nextDouble();
                
                        //Check the number is in the correct range.
                        if (score >= 0 && score <= 100) {
                            scores[i] = score;
                            total += score;
                            validScore = true;
                        } else {
                            System.out.print("Invalid Score!! Please enter a number from 0 to 100.");
                        }
                    }else {
                        //This will check if the user enters text instead of valid number.
                        System.out.print("Invalid Input!! Please enter a numeric Score.");
                        input.next();
                    }   
                }
            }
    
            // Calculate the average score.
            double average = total / scores.length;
    
            // Display the scores entered by the user.
            System.out.print("\nStudent Scroes Result");
            System.out.print("\nScore 1 : " + scores[0]);
            System.out.print("\nScore 2 : " + scores[1]);
            System.out.print("\nScore 3 : " + scores[2]);
    
            //Display the average scores
            System.out.printf("\nAverage Score: %.2f\n", average);
    
            // Judgement passed or failed by using if/else statement 
            if (average >= 60) {
                System.out.print("Result : Pass");
            } else {
                System.out.print("Result : Fail");
            }
            
            
            // Ask user whether they want to try again or exit
            System.out.print("\nDo you want to try again? Enter Y for Yes or N for No: ");
            String choice = input.next();

                if (choice.equalsIgnoreCase("Y")) {
                    tryAgain = true;
                    System.out.println("\nStarting again...\n");
                } else if (choice.equalsIgnoreCase("N")) {
                    tryAgain = false;
                    System.out.println("Program exited. Thank you!");
                } else {
                    tryAgain = false;
                    System.out.println("Invalid choice. Program exited.");
                }
        }
            
            // Closing the scanner object.
            input.close();
    }
}



