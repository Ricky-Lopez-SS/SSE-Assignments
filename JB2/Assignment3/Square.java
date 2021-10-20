import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javax.swing.JFrame;

/**
 * @author Ricky Lopez
 */

public class Square implements Shape {

    
    int length;

    public Square(int length){
        this.length = length;
    }

    @Override
    public void display(){

        JFrame frame = new JFrame();

        frame.setTitle("Square Display");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new SquarePaintComponent(length));
        frame.setVisible(true);

    }

    @Override
    public double calculateArea(){
        return length * length;
    }

    public class SquarePaintComponent extends Component{

        int length;

        public SquarePaintComponent(int length){
            super();
            this.length = length;
        }

        @Override
        public void paint(Graphics g){

            Graphics2D g2d = (Graphics2D)g;

            g2d.fillRect((int) Math.round(250 - this.length/1.5), (int) Math.round(250 - this.length/1.5), this.length, this.length);

        }
    }


}
