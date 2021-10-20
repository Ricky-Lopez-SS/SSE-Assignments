import java.util.Scanner;

/**
 * @author Ricky Lopez
 */

public class Main {

    public static void main(String[] args){

        
        Scanner scnnr = new Scanner(System.in);
        String input = "";
        int length, height;
        length = height = 0;

        System.out.format("Please choose either a triangle, shape or square to work with. You choose by typing the name of the shape. %n");

        while(scnnr.hasNextLine()){

            input = scnnr.nextLine().toLowerCase();

            if(!input.equals("square") && !input.equals("circle") && !input.equals("triangle")){
                System.out.println("I'm sorry, that is not a valid choice. Please try again.");
                continue;
            }

            break;
        }

        if(input.equals("square")){

            System.out.println("Please specify an integer side length between 10 and 400.\n");

            while(scnnr.hasNextLine()){

                try{
                    length = Integer.parseInt(scnnr.next());
                }catch(NumberFormatException e){
                    System.out.println("That is not a valid number. Please try again.");
                    continue;
                }

                break;

            }

            Square square = new Square(length);
            square.display();

        }else if(input.equals("circle")){

            System.out.println("Please specify an integer diameter length between 10 and 200. (WARNING: higher values may not appear completely on the display!)\n ");

            while(scnnr.hasNextLine()){

                try{
                    length = Integer.parseInt(scnnr.next());
                }catch(NumberFormatException e){
                    System.out.println("That is not a valid number. Please try again.\n");
                    continue;
                }

                break;

            }

            Circle circle = new Circle(length);
            circle.display();

        }else if(input.equals("triangle")){

            System.out.println("Please specify an integer base length between 10 and 400.\n");

            while(scnnr.hasNextLine()){

                try{
                    length = Integer.parseInt(scnnr.next());
                }catch(NumberFormatException e){
                    System.out.println("That is not a valid number. Please try again.\n");
                    continue;
                }

                break;

            }

            System.out.println("Please specify an integer base height between 10 and 400.\n ");

            while(scnnr.hasNextLine()){

                try{
                    height = Integer.parseInt(scnnr.next());
                }catch(NumberFormatException e){
                    System.out.println("That is not a valid number. Please try again.\n");
                    continue;
                }

                break;

            }


            Triangle triangle = new Triangle(length, height);
            triangle.display();
        }

        scnnr.close();
        

    }
    


}
