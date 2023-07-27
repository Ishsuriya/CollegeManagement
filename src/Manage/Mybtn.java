

package Manage;

import java.awt.*;
import java.awt.Color;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.BevelBorder;
import java.awt.GradientPaint;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class Mybtn extends JButton{
        Color c1=Color.decode("#ff00ff");
        Color c2=Color.decode("#00ff00");
       
public Mybtn(){
            //super(name);
        setContentAreaFilled(false);
        
    }
    @Override
    protected  void paintComponent(Graphics g){
       
//        int width=getWidth();
//        int height=getHeight();
//        g.setColor(Color.PINK);
//        g.fillRoundRect(0, 0, width, height, 100,50);
//        Graphics2D g2=(Graphics2D) g;
//        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
//         g2.setColor(Color.CYAN);   
//        g2.fillRoundRect(0, 0, width, height, width,width );
//        g.drawLine(10,10,100,10);
       int width=getWidth();
       int height=getHeight();
       Graphics2D g2=(Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gp=new GradientPaint(0,0,c1,0,50,c2);
        g2.setPaint(gp);
                
        g2.fillRoundRect(0, 0, width, height,50,50);
        super.paintComponent(g);
        }
    }


    

