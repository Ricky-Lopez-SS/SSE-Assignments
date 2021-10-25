
/**
 * @author Ricky Lopez
 */

public class RSingleton {
    
    protected static RSingleton instance = null;

    private RSingleton(){}

    public RSingleton getInstance(){

        if(instance == null){
            synchronized(this){
                if(instance == null) return new RSingleton();  
            }
        }
        
        return instance;

    }



}
