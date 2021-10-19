import java.util.Scanner;
import java.util.Random;

/**
 * @author Ricky Lopez
 */

public class Assignment2 {

    public static void main(String[] args){

        Scanner scnnr = new Scanner(System.in);
        int input;
        int answer = new Random().nextInt(100) + 1;
        int invalidCounter = 0;

        System.out.println("Please guess a number between 1 and 100.");

        while(scnnr.hasNextLine()){

            try{
                input = Integer.parseInt(scnnr.next());
            }catch(NumberFormatException e){ //input was not a numerical integer value.

                invalidCounter++;
                if(invalidCounter >= 5){
                    System.out.format("Sorry, the correct answer was %d.", answer);
                    scnnr.close();
                    return;
                }
                
                System.out.println("Please enter a valid number between 1 and 100.");
                continue;
            }

            if(input > 100 || input < 1){ //input was not within 1-100. 

                invalidCounter++;
                if(invalidCounter >= 5){
                    System.out.format("Sorry, the correct answer was %d.", answer);
                    scnnr.close();
                    return;
                }
                
                System.out.println("Please enter a valid number between 1 and 100.");
                continue;
            }

            if(Math.abs(input - answer) <= 10){ //input was within 10 of the correct answer.
                System.out.format("You were within 10 of the correct answer! The answer was %d", answer);
                scnnr.close();
                return;
            }
           
            invalidCounter++;
            if(invalidCounter >= 5){
                System.out.format("Sorry, the correct answer was %d.", answer);
                scnnr.close();
                return;
            }

            System.out.println("Incorrect, keep guessing!");

        }

        scnnr.close();

    }


}
