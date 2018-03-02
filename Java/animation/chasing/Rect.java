import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;



import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
public class Rect 
{
    int x, y;
    
    
    public Rect(int startX, int startY){
        x = startX;
        y = startY;
    }

    
    public void move(int velX, int velY){
        if(x< 0||x>500){
            velX = -velX;//will make rectangle go back way it came i.e. from right of screen to left 
        }
        if(y < 0|| y > 200){
            velY = -velY;
        }
         x = x+velX;//x will be moved by 2(speed of rectangle) every 5 milliseconds
         y = y+velY;
    }



    public Rectangle getBounds(){//returns a rectangle
        //creates and returns a rectangle
        //new rectangle will have coordinates of whatever rec passed in
        //so will return coordinates of an object
        return (new Rectangle(x, y, 50, 30));// x and y will be coordinates of the rectangle method called on
        //50 and 30 are width and height of the other rectangles


    }

   







}