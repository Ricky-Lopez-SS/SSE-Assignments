import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * @author Ricky Lopez
 */

public class Main {
    
    public static void main(String[] args) throws InterruptedException{

        ArrayList<String> buffer = new ArrayList<String>();

        Thread cThread = new Thread(new ConsumerThread(buffer));
        Thread pThread = new Thread(new ProducerThread(buffer));

        System.out.println("At any point during the program, press Enter to see the current state of the buffer. enter \"quit\" to quit.\n");

        TimeUnit.SECONDS.sleep(2);
        System.out.println("Beginning production line..\n");        

        pThread.start();
        cThread.start();

        Scanner scnnr = new Scanner(System.in);

        while(scnnr.hasNextLine()){
            if(scnnr.nextLine().toLowerCase().equals("quit")){
                pThread.suspend();
                cThread.suspend();
                break;
            }
            System.out.print(buffer);
        }

        scnnr.close();

    }

}
