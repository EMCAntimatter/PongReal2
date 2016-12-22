import java.awt.*;
import java.awt.geom.*;
import java.applet.Applet;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.*;


public class Pong extends JFrame
{
    PongPane pongPane;
 
    
   
    public Pong(){
    super("Pong");
    setSize(500, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pongPane = new PongPane();

    this.add(pongPane);
    setVisible(true);
    
    
    }    
    
    
    public static void main(String[] arguments){

        Pong pongGame = new Pong();
        pongGame.setFocusable(true);
        pongGame.requestFocusInWindow();

        pongGame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                case 87:{ //w
                    pongGame.Paddle1Up();                    
                    break;
                     }
                case 68:{
                    pongGame.Paddle1Down();
                    break;}
                case 38:{
                    pongGame.Paddle2Up();
                    break;}
                case 40:{
                    pongGame.Paddle2Down();
                    break;}

                }
            }
        });
    }
    
    public void Paddle1Up(){
        pongPane.y1Paddle1 += pongPane.PaddleMoveSpeed;
        pongPane.y2Paddle1 += pongPane.PaddleMoveSpeed;
    }
    
    public void Paddle1Down(){
        pongPane.y1Paddle1 -= pongPane.PaddleMoveSpeed;
        pongPane.y2Paddle1 -= pongPane.PaddleMoveSpeed;
    }
    
    public void Paddle2Up(){
        pongPane.y1Paddle2 += pongPane.PaddleMoveSpeed;
        pongPane.y2Paddle2 += pongPane.PaddleMoveSpeed;
    }
    
    public void Paddle2Down(){
        pongPane.y1Paddle2 -= pongPane.PaddleMoveSpeed;
        pongPane.y2Paddle2 -= pongPane.PaddleMoveSpeed;
    }
      
}
