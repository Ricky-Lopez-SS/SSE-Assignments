import java.io.File;
import java.util.Scanner;


/**
 * @author Ricky Lopez
 */

public class Assignment1 {

    public static void main(String[] args){

        System.out.format("Please enter the path of a directory you wish to see the contents of.%n");

        Scanner scnnr = new Scanner(System.in);
        File file;


        try{

            file = new File(scnnr.next());

            if(!file.isDirectory()){ //file is not a directory
                System.out.println("The file you've chosen either does not exist, or is not a directory. ");
                scnnr.close();
                return;
            }
            
    
            if(file.list().length == 0){
                System.out.format("%nThere are no files in this directory.");
                scnnr.close();
                return;
            } 
    
            for(String i : file.list()){
                System.out.println(i);
            }

        }catch(NullPointerException e){
            System.out.println("Sorry, the path you chose is not a valid path. Please check your path and try again.");
            scnnr.close();
            return;
        }

        scnnr.close();
        

    }
    
}
