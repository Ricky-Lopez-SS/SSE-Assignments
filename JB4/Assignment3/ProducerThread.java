import java.util.ArrayList;
/**
 * @author Ricky Lopez
 */

public class ProducerThread implements Runnable{

    volatile ArrayList<String> buffer;

    public ProducerThread(ArrayList<String> buffer){
        this.buffer = buffer;
    }

    public void grow(){
        buffer.add("Food");
        System.out.println("Food grown from Producer Thread.");
        return;
    }
    
    public void run(){
        for(int i = 0; i < 10 ; i++){
            grow();
            try{
                Thread.sleep(3000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Done producing!");
    }

}