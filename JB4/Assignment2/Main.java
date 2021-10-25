
/**
 * @author Ricky Lopez 
 */

public class Main {
    public static void main(String[] args){

        Integer a = 10;
        Integer b = 20;

        Thread thread1 = new Thread(new RRunnable(a, b));
        Thread thread2 = new Thread(new RRunnable(b, a));

        thread1.start();
        thread2.start();
        
        
    }
}

class RRunnable implements Runnable{

    Integer a;
    Integer b;

    public RRunnable(Integer a, Integer b){
        this.a = a;
        this.b = b;
    }

    

    @Override
    public void run(){

        System.out.format("Thread %d has begun.%n", Thread.currentThread().getId());

            try{
                synchronized(a){
                    Thread.sleep(5000);
                    synchronized(b){
                        Thread.sleep(5000);
                    }
                }
            }catch(InterruptedException e){
                e.printStackTrace();
            }

        System.out.format("Thread %d has finished running!%n", Thread.currentThread().getId()); //should never occur.
    }


}

