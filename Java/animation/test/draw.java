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

public class draw   {
   
    public static void main (String[] args){
        
           
            JFrame jf = new JFrame();
            jf.setTitle("Hello");
            jf.setSize(500,300);
            jf.setVisible(true);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jf.add(new Paint());
         
    }
}

    class Paint extends JPanel implements ActionListener, KeyListener {
        Timer tm;
        
        Rect rect1;
        Rect rect2;
        int velX = 0;//x is the position horizontally of
        // panel, velX is speed of rectangle
        int velY = 0;
        int score = 0;
        

        public Paint() {//paint method
            //create two rectangles with starting positions below
            //values passed in to constructors
            rect1 = new Rect(0, 75);
            rect2 = new Rect(100, 50);
            
           tm = new Timer(5, this);
           tm.start();
           setBackground(Color.CYAN);
           addKeyListener(this);//refers to the interface keyListener
            //need to enable key listener
            setFocusable(true);//true as we want to enable keyListener
            //at this stage
            setFocusTraversalKeysEnabled(false);//false as we will not be using shift or tab key
        
        }
        public void actionPerformed(ActionEvent e){
            rect1.move(velX, velY);
            //rect2.move(velX, velY);
            repaint();//will repaint every 9 milliseconds
        }
        

        public void paint(Graphics g){
            super.paint(g);
            g.setColor(Color.black);
            g.fillRect(rect1.x, rect1.y, 50, 30);
            g.setColor(Color.blue);
            g.fillRect(rect2.x, rect2.y, 50, 30);
            String scoreMessage = (Integer.toString(score));
            g.drawString(scoreMessage, 400, 200);
            if(collision()){
                g.drawString("Appear somewhere else", 300, 150);
                rect2.x = (int)(Math.random()*300 + 1);
                rect2.y = (int)(Math.random()*300 + 1);
                score ++;
                
                
            }


        }

        //check for collision, intersection of any object
        public boolean collision(){
            //create two new rectangles, one with rec1 location and one with rec2 location
            //if they at same position then a collision occured
            Rectangle rectangleCheck1 = rect1.getBounds();
            Rectangle rectangleCheck2 = rect2.getBounds();
            if(rectangleCheck1.intersects(rectangleCheck2)){
                return true;
            }
            return false;
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
        public void keyTyped(KeyEvent e){}
   public void keyReleased(KeyEvent e){//if we want rec to stop when user not moving it i.e no roll, then use this method
        //just set everything to 0
       //velX = 0;
       // velY = 0;

}

    }


