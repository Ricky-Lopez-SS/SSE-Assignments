import java.util.ArrayList;

/**
 * @author Ricky Lopez
*/

public class Assignment1 {

    public static void main(String[] args){

        if(args.length == 0) {
            System.out.format("%nYou have no arguments listed! Try again with some valid command line arguments.");
            return;
        }


        boolean hasInvalid = false;
        int sum = 0;

        ArrayList<String> list = new ArrayList<>();
    
        for(String s : args){

            try{
                sum += Integer.parseInt(s);
            }catch(NumberFormatException e){
            
                if(!hasInvalid){hasInvalid = true;} //sets invalid flag to true.
                list.add(s); //appends invalid string to output later.
                continue;

            }
        }

        
        if(hasInvalid){ 
            System.out.format("%none or more of your inputs are invalid, so they were not considered whilst calculating the sum.%n");
            System.out.println("invalid inputs: " + list);
        }


        System.out.format("%nTotal sum: %d", sum);

    }
}