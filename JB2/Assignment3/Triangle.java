import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javax.swing.JFrame;

/**
 * @author Ricky Lopez
 */

public class Triangle implements Shape {

    int length;
    int height;

    public Triangle(int length, int height){
        this.length = length;
        this.height = height;
    }

    @Override
    public double calculateArea(){
        return this.length * this.height / 2;
    }
  
    @Override
    public void display(){
        JFrame frame = new JFrame();

        frame.add(new TrianglePaintComponent(this.length, this.height));
        frame.setTitle("Triangle Display");
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        System.out.format("Area is: %f%n" , this.calculateArea());
    }



    class TrianglePaintComponent extends Component{

        int length;
        int height;

        public TrianglePaintComponent(int length, int height){
            super();
            this.length = length;
            this.height = height;

        }


        @Override
        public void paint(Graphics g){

            Graphics2D g2d = (Graphics2D)g;

            Polygon triangle = new Polygon();
            triangle.addPoint(250 - this.length/2, 250 + height/2);
            triangle.addPoint(250 + this.length/2, 250 + height/2);
            triangle.addPoint(250, 250 - this.height/2);

            g2d.fillPolygon(triangle);

        }

    }

}
