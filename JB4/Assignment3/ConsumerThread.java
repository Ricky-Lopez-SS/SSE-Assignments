import java.util.ArrayList;

/**
 * @author Ricky Lopez
*/


public class ConsumerThread implements Runnable{

    volatile ArrayList<String> buffer;

    public ConsumerThread(ArrayList<String> buffer){
        this.buffer = buffer;
    }

    public void eat(){

        if(buffer.size() == 0){
            System.out.println("Sorry, there is nothing to eat!");
            return;
        }

        buffer.remove(0);
        System.out.println("Food eaten by Consumer Thread.");
        return;
    }

    @Override
    public void run(){
        for(int i = 0; i < 10 ; i++){
            try{
                Thread.sleep(5000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            eat();
        }

        System.out.println("Done eating!");
    }
}
