import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 * @author Ricky Lopez
 */

public class Square implements Shape {
    
    float length;

    public void display(){

    }

    public float calculateArea(){
        return length * length;
    }
}
