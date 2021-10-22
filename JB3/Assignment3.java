import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileInputStream;

/**
 * @author Ricky Lopez
 */

public class Assignment3 {
    
    public static void main(String[] args){

        System.out.println("Please enter the path of the file.");

        int counter = 0;
        String input = "";
        Scanner scnnr = new Scanner(System.in);
        

        if(scnnr.hasNext()) input = scnnr.next();

        File file = new File(input);

        if(!file.canRead()){
            System.out.println("Sorry, this file either does not exist, or cannot be read. Please try again.");
            scnnr.close();
            return;
        }

        if(args.length == 0){

            System.out.println("Please enter that character sequence you would like to search for.");
            if(scnnr.hasNext()) input = scnnr.next();
        }else{
            input = args[0];
        }

        scnnr.close();

        try(Scanner fileScnnr = new Scanner(new FileInputStream(file))){

            while(fileScnnr.hasNext()){
                if(fileScnnr.next().contains(input)) counter++;
            }

        }catch(IOException e){ 
            System.out.println("Sorry, the file you have entered could not be found. Please check your file path and try again.");
            return;
        }

        if(counter == 0) System.out.println("This file has no occurrences of this sequence.");
        else System.out.format("This file has %d occurrences of this sequence.%n", counter);

    }
}
