import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    int xLoc = 200;
    int yLoc = 300;

    int xVel = 10;
    public MyPanel(){

        setBackground(Color.yellow);
    }


    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        // ^ what does that do
//        System.out.println("Hi!");
        // loop 20 times to make circles
        // x = random number 0-end of frame, y = random number 0- -end of frame, width and height = random number 1-30, speed
        // g.fillOval(x, y, w, h);
      //  x +
        g.fillOval(40,30,10,10);
        g.fillOval(400, 400, 5, 5);
        g.setColor(Color.RED);
        g.fillOval(xLoc, yLoc, 20, 20);
//        xLoc +=2;
        xLoc += xVel;
        //yLoc -=4;

        if (xLoc > getWidth()-20){
            xVel=  xVel*-1;
        }
        if( xLoc <= 0){
            xVel = xVel*-1;
        }


        g.setColor(Color.blue);
        g.drawString("Hello World", 0, 50);

        try {
            Thread.sleep(100);
        }
        catch(Exception e){
            System.out.println(e);
        }
        repaint();
    }


}
