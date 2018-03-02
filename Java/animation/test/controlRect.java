//Create a rectangle and move it based on x and y coordinates and giving it a velocity 

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;//used for button press
import java.awt.event.ActionListener;//The interface
import java.awt.event.KeyListener;//Needed to get input from users

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Rectangle;


public class controlRect extends JPanel implements ActionListener,KeyListener

{
    public static int score = 0;
    Timer tm = new Timer(5, this);
    
    //first rec object
    int x = 0, y = 0, velX = 0, velY = 0;//x is the position horizontally of
    // panel, velX is speed of rectangle
    //all start at zero becuase user has not yet moved it yet
    //second rec object
    int x2 = 0, y2 = 0, velX2 = 2, velY2 = 2;
    
    

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //can make as many rectangles as I want using bottom two lines of code
        g.setColor(Color.RED);
        g.fillRect(x, y, 50, 30);//starts at left of screen
       
       
        g.setColor(Color.black);
        g.fillRect(50, 30, 50, 30);
       String loseMessage = "You lose a point";
        String myscore = Integer.toString(score);
        g.drawString(myscore, 200, 100);
    
        tm.start();//will start the timer
        //need to construct keyListener
        addKeyListener(this);//refers to the interface keyListener
        //need to enable key listener
        setFocusable(true);//true as we want to enable keyListener
        //at this stage
        setFocusTraversalKeysEnabled(false);//false as we will not be using shift or tab key
       

    }
    

    //make action class, will dictate what happens to our objects
    //only method that animates rectangle
    public void actionPerformed(ActionEvent e){
        //if want to restrict x from leaving screen and not bounce back
       /* if(x < 0)//as far left as possible
        {
            velX = 0;
            x = 0;//reposition back to screen
        }
        if(x > 530){//if rec on right side of screen
            velX = 0;
            x = 530;
        }
        if(y < 0){//at the top of screen
            velY = 0;
            y = 0;
        }
        if(y > 330){//if at bottom of screen
            velY = 0;
            y = 330;//reposition y to 330, back on the screen, could set y to zero and then would spawn at top of screen could be used if a character died 
        }*/
        //code to make rec bounce back from hitting edges
        if(x<0||x>550){
            velX = -velX;
            score = score + 1;
        }
        if(y<0||y>270){
            velY = -velY;
            score = score + 1;
        } 
        x = x+velX;//x is initially to zero but if user presses right, 
        //then velx will be 1 so will be 1+0 so x will move
        y = y+velY;//initially zero but based on keys, new values will be
        //made and added
        //move the second rec object
       /* if(x2 < 0||x2>550){
            velX2 = -velX2;//will make rectangle go back way it came i.e. from right of screen to left 
        }
        if(y2 < 0 || y2 > 270){
            velY2 = -velY2;
        }*/
        
        
        // x2 = x2+velX2;//x will be moved by 2(speed of rectangle) every 5 milliseconds
         //y2 = y2+velY2;
        repaint();//draws the object at a new position

    }
    public void keyPressed(KeyEvent e){//uses key event libray
        //This method dictates what happens when a button is pressed
        int c = e.getKeyCode();//each button in a keyboard has a special code value that we can utilise
        if(c==KeyEvent.VK_LEFT)//the special code for left arrow key on keyboard
        {
            velX = -1;//going left on screen, using negative value
            velY = 0;//zero because not pressing up or down key
        }
        if(c == KeyEvent.VK_UP){
            velX = 0;//zero because not pressing left or right key
            velY = -1;//if going up be in negative value,
            //if going down, be a positive value
        }
        if(c==KeyEvent.VK_RIGHT){
            velX = 1;//positive because going left-right on screen is positive
            velY = 0;//zero because moving horizontally
            // does not affect vertical at all and so remain the same
        }
        if(c==KeyEvent.VK_DOWN){
            velX = 0;//zero because not pressing right or left key
            velY = 1;//positive because going down is positive
        }

    }
    //need this method for compile to run successfully
    public void keyTyped(KeyEvent e){}
   public void keyReleased(KeyEvent e){//if we want rec to stop when user not moving it i.e no roll, then use this method
        //just set everything to 0
       /* velX = 0;
        velY = 0;*/

    }




    public static void main (String[] args){
        controlRect t = new controlRect();
        
        JFrame jf = new JFrame();
        jf.setSize(600,400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(t);
      
        
        
    }


}