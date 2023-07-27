
package Manage;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;

public class btnpanel  extends JPanel{
//    Graphics g1;
//    public btnpanel(){
//        setOpaque(false);
//        this.setBackground(new Color(0,0,0,0));
//        
//    }
//    private int radius=30;
//    public int getRadius(){
//        return radius;
//        
//    }
//    public void setRadius(int radius){
//        this.radius=radius;
//    }
//    private int side=200;
//    public int getSide(){
//        return side;
//    }
//     public void setSide(int radius){
//        this.side=side;
//    }
//    @Override
//     public void paintComponent(Graphics g){
//         Graphics2D gg=(Graphics2D) g;
//         gg.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//        gg.setColor(Color.BLUE);
//        gg.fillRoundRect(0,0,getWidth(),getHeight(),radius,radius);
//        super.paintComponent(g);
//    }
//     }
   Color first,second;
   
   public btnpanel(){
      setOpaque(false);
   }

    private String color1="#ff0000";
    public String getColor1(){
        return color1;
    }
    public void setColor1(String color1){
        this.color1=color1;
    }
     private String color2="#00ff00";
    public String getColor2(){
        return color1;
    }
    public void setColor2(String color2){
        this.color2=color2;
    }
    private int radius=30;
    public int getRadius(){
        return radius=radius;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
   @Override
    protected void paintComponent(Graphics g){
        first=Color.decode(color1);
        second=Color.decode(color2);
        Graphics2D g2=(Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
       GradientPaint gp=new GradientPaint(0,0,first,getWidth(),getWidth(),second);
        g2.setPaint(gp);
        g2.fillRoundRect(0,0,getWidth(),getHeight(),radius,radius);
        super.paintComponent(g);
  }
}   

   
  

