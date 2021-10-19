/**
*  @author Ricky Lopez
*/

public class Assignment1{
    public static void main(String[] args){

        System.out.println();
        
        String spaces = "     ";
        String pattern = "";

        //Pattern 1

        System.out.println("1)");
        
        for(int i = 0; i < 4; i++){
            pattern += '*';
            System.out.println(pattern);
        }
        System.out.println(".........\n");

        //Pattern 2

        System.out.println("2)");

        System.out.println("..........");

        for(int i = 0; i < 4; i++){
            System.out.println(pattern.substring(i));
        }

        System.out.println();

        //Pattern 3

        System.out.println("3)");

        pattern = "*";

        for(int i = 0; i < 4; i++){
            System.out.println(spaces.substring(i) + pattern + spaces.substring(i));
            pattern += "**";
        }

        System.out.println("...........\n");

        //Pattern 4

        System.out.println("4)");
        
        spaces += ' ';

        System.out.println("............");

        for(int i = 4; i > 0; i--){
            pattern = pattern.substring(2);
            System.out.println(spaces.substring(i) + pattern + spaces.substring(i-1));
        }




    }
}