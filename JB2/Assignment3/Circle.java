import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

import javax.swing.JFrame;

/**
 * @author Ricky Lopez
 */

public class Circle implements Shape {

    int diameter;

    public Circle(int radius){
        this.diameter = radius*2;
    }

    @Override
    public void display(){

        JFrame frame = new JFrame();

        frame.setSize(500, 500);
        frame.setTitle("Circle Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new CirclePaintComponent(this.diameter));
        frame.setVisible(true);

        System.out.format("Area is: %f%n" , calculateArea());


    }

    @Override
    public double calculateArea(){
        double radius = diameter/2;
        return Math.PI * (radius * radius);
    }

    class CirclePaintComponent extends Component{

        int diameter;

        public CirclePaintComponent(int diameter){
            super();
            this.diameter = diameter;

        }

        @Override
        public void paint(Graphics g){

            Graphics2D g2d = (Graphics2D)g;

            g2d.fillOval((int) Math.round(250 - this.diameter/1.5), (int) Math.round(250 - this.diameter/1.5), this.diameter, this.diameter);

        }
    }
}
