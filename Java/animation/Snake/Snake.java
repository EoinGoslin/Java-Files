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


public class Snake {
    public static void main (String[]args) {

        JFrame jf = new JFrame();
        jf.setTitle("Hello");
        jf.setSize(500,300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(new Paint());


    }
}