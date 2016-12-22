import java.awt.*;
import java.awt.geom.*;
import java.applet.Applet;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class PongPane extends JPanel {
    int x = 0;
    
    int PaddleMoveSpeed = 10;
    
    int x1Paddle1 = 10;
    int x2Paddle1 = 10;
    int y1Paddle1 = 150;
    int y2Paddle1 = 250;
    
    int x1Paddle2 = 450;
    int x2Paddle2 = 450;
    int y1Paddle2 = 150;
    int y2Paddle2 = 250;
    
    int[] score = new int[2];
    score[0] = 0;
    score[1] = 0;


    Ball gameBall = new Ball();
    paddle paddle1 = new paddle(x1Paddle1, y1Paddle1, x2Paddle1, y2Paddle1);
    paddle paddle2 = new paddle(x1Paddle2, y1Paddle2, x2Paddle2, y2Paddle2);
    
    boolean running = true;
    
    public PongPane(){
        
        // Compute the new ball coordinates 
        Timer timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                            
                if (running) {
                    //GAME_LOOP
                    repaint();
                }
            }
        });
        timer.start();
    }
    @Override
    public void start() {
        
        
        
        if (!running) {
            running = true;
            repaint();
        }
    }
    @Override
    public void paintComponent(Graphics comp){
       super.paintComponent(comp);
       wipe(comp);
       draw(comp);
       
       boolean collision = Collision.collisionTest(gameBall, paddle1, paddle2); 
        
       if(collision == true){
           gameBall.Vx = -1 * gameBall.Vx;
       }
       
       else if(gameBall.xBall < 0){
           score[0] += 1;
           
           }
           
       else if(gameBall.xBall > 500){
         
           score[1] += 1;
           
           }
        
        
       }
    
    
    public void draw(Graphics comp){
        gameBall.ballUpdate(comp, score[]);
    
        comp.setColor(Color.blue);
        comp.drawLine(x1Paddle1, y1Paddle1, x2Paddle1, y2Paddle1);
        
        comp.setColor(Color.blue);
        comp.drawLine(x1Paddle2, y1Paddle2, x2Paddle2, y2Paddle2);
    }
    public void wipe(Graphics comp)
    {
        comp.setColor(Color.white);
        comp.fillOval(xBall, yBall, 30, 30);
        
        comp.setColor(Color.white);
        comp.drawLine(x1Paddle1, y1Paddle1, x2Paddle1, y2Paddle1);
        
        comp.setColor(Color.white);
        comp.drawLine(x1Paddle2, y1Paddle2, x2Paddle2, y2Paddle2);
    }
    public void reset(){
        gameBall = null;
        paddle1 = null;
        paddle2 = null;
        
        System.gc()
        
        Ball gameBall = new Ball();
        paddle paddle1 = new paddle(x1Paddle1, y1Paddle1, x2Paddle1, y2Paddle1);
        paddle paddle2 = new paddle(x1Paddle2, y1Paddle2, x2Paddle2, y2Paddle2);
    }

}
