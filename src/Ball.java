import javax.swing.*;
import java.awt.*;
import java.awt.Color;
public class Ball extends JPanel{
    private int x;
    private int y;
    private int xVel;
    private int yVel;
    private int color;
    private int xLoc;
    private int yLoc;
    private Color colord;



    public Ball() {
        x = (int) (Math.random() * 50 + 10);
        y = (int) (Math.random() * 50 + 10);
        xVel = (int) (Math.random() * 50 + 2);
        yVel = (int) (Math.random() * 50 + 2);
        color = (int) (Math.random() * 255);
        colord.
    }
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            // ^ what does that do
//        System.out.println("Hi!");
            // loop 20 times to make circles
            // x = random number 0-end of frame, y = random number 0- -end of frame, width and height = random number 1-30, speed
            // g.fillOval(x, y, w, h);
            //  x +
            g.fillOval(40,30,x,y);
            g.fillOval(400, 400, x, y);
            g.setColor();
            g.fillOval(xLoc, yLoc, 20, 20);
//        xLoc +=2;
            xLoc += xVel;
            yLoc += yVel;
            //yLoc -=4;

    }



}
