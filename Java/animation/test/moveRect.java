//Create a rectangle and move it based on x and y coordinates and giving it a velocity

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class moveRect extends JPanel implements ActionListener
{
    Timer tm = new Timer(9, this);
    int x = 0, velX = 2;//x is the position horizontally of
    // panel, velX is speed of rectangle
    int y = 0, velY = 2;

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //can make as many rectangles as I want using bottom two lines of code
        g.setColor(Color.RED);
        g.fillRect(x, 30, 50, 30);//This is to make it go side to side
        g.setColor(Color.CYAN);
        g.fillRect(30, y, 50, 30);
     
        tm.start();//will start the timer
    }
    public void actionPerformed(ActionEvent e){
       //if we want to make rectangle bounce on side of screen, implement if statement below
       //our window is 600x400, we dont use 600 below because the rectangle
       //width is 50 so if 550 away then touching the edge of screen - 600-50 = 550

       if(x< 0||x>550){
           velX = -velX;//will make rectangle go back way it came i.e. from right of screen to left 
       }
       if(y < 0|| y > 270){
           velY = -velY;
       }
        x = x+velX;//x will be moved by 2(speed of rectangle) every 5 milliseconds
        y = y+velY;
        repaint();//will repaint every 5 milliseconds, redraw rectangle on timer time to give illusion of movement
    }

    public static void main (String[] args){
        moveRect t = new moveRect();
        JFrame jf = new JFrame();
        jf.setTitle("Hello");
        jf.setSize(600,400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(t);
        
    }


}