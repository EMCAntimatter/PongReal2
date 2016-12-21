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

public class Ball
{
    int Vx = 2;
    int Vy = 1;
    int xBall = 250;
    int yBall = 250;
    public Ball(){
       
    }
    public void updateBall(Graphics comp){
        comp.setColor(Color.white);
        comp.fillOval(xBall, yBall, 30, 30);
        xBall += Vx;
        yBall += Vy;
        if (xBall > 500 || xBall < 0){Vx = -1 * Vx;}
        if (yBall > 500 || yBall < 0){Vy = -1 * Vy;}
        comp.setColor(Color.red);
        comp.fillOval(xBall, yBall, 30, 30);
    }
    
}
