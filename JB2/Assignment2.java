import java.util.Random;

public class Assignment2 {
    public static void main(String[] agrs){

        int max = 0;

        int counter = 0;

        int[][] array = new int[10][10];

        for(int i = 0; i < array.length; i++){
            for(int k = 0; k < array[i].length; k++){
                array[i][k] = new Random().nextInt(1000);
                System.out.println("index: " + counter + " value:  " + array[i][k]);
                counter++;
            }
        }

        for(int[] ii : array){
            for(int kk : ii){
                if( kk > max){
                    max = kk;
                }
            }
        }

        System.out.format("%nmax value is: %d%n" , max);
    }
}
