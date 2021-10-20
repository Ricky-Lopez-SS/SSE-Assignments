import java.util.Random;
import java.util.Scanner;

/**
 * @author Ricky Lopez
 */

public class Assignment2 {
    public static void main(String[] agrs){

        int max = 0;
        Random rand = new Random(); 
        String input;

        int xpos, ypos;
        xpos = ypos = 0;

        int[][] array = new int[10][10];

        Scanner scnnr = new Scanner(System.in);

        System.out.println("would you like the entire array printed out? type y for yes, n for no");

        input = scnnr.next().toLowerCase();

        if(!input.equals("n")){
            System.out.println("Sorry, I don't understand. I'll assume you do not want the array printed out.");
        }


        for(int i = 0; i < array.length; i++){
            for(int k = 0; k < array[i].length; k++){
                array[i][k] = rand.nextInt(1000);
                if(input.equals("y")){System.out.format("index: (%d, %d)  value:  %d%n", i, k, array[i][k]);} //prints out every index position and value. 
            }
        }


        //finds max. 
        for(int i = 0; i < array.length; i++){
            for(int k = 0; k < array[i].length; k++){
                if( array[i][k] > max){
                    max = array[i][k];
                    xpos = i;
                    ypos = k;
                }
            }
        }

        System.out.format("%nmax value is %d, found at position (%d, %d).%n", max, xpos, ypos);
        scnnr.close();
    }
}
