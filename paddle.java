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

public class paddle
{
    
    public paddle(int x1Paddle, int y1Paddle, int x2Paddle, int y2Paddle)
    {
    }

   
    public void paddleUpdate(int x1Paddle, int y1Paddle, int x2Paddle, int y2Paddle, Graphics comp){
        comp.setColor(Color.white);
        comp.drawLine(x1Paddle, y1Paddle, x2Paddle, y2Paddle);
        //update paddle chords
        comp.setColor(Color.blue);
        comp.drawLine(x1Paddle, y1Paddle, x2Paddle, y2Paddle);
    }
}
