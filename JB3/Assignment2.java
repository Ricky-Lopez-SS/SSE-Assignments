import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Ricky Lopez
 */

public class Assignment2 {

    public static void main(String[] args){

        System.out.println("Please enter the path of the file you would like to modify.");

        Scanner scnnr = new Scanner(System.in);

        File file = new File(scnnr.next());
        
        if(!file.canWrite()){
            System.out.println("Sorry, this file either does not exist or cannot be written to. Please try another file.");
            scnnr.close();
            return;
        }
        
        System.out.println("Please enter the text you would like to append to this file.");

        String input = "";

        scnnr.nextLine(); //gets rid of the newline appended after clicking enter in terminal.

        if(scnnr.hasNextLine()) input = scnnr.nextLine(); 


        try(FileWriter fw = new FileWriter(file, true)){
            fw.write(input + "\n");
        }catch(IOException e){e.printStackTrace();}

        scnnr.close();

    }

}
