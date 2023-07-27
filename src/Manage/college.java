
package Manage;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class  college extends JFrame implements ActionListener{
   college(){
        super("College Management System");
        
        setSize(1920,1030);
        
        ImageIcon ic =  new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/col5.jpg"));
        Image i3 = ic.getImage().getScaledInstance(1900, 750,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);
        
        add(l1);
        
        JMenuBar mb  = new JMenuBar();
        JMenu master = new JMenu("NewAdmission");
         master.setFont(new Font("monospaced",Font.BOLD,24));
        
        JMenuItem m2 = new JMenuItem("New Student Admission");
        master.setForeground(Color.BLUE);
        
        
        
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon1.png"));
        Image image1 = icon1.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        
        m2.setFont(new Font("monospaced",Font.BOLD,32));
        ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon2.png"));
        Image image2 = icon2.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        m2.setIcon(new ImageIcon(image2));
        m2.setMnemonic('B');
        m2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        m2.setBackground(Color.WHITE);
    
        
        
        m2.addActionListener(this);
        

  
        
        JMenu user = new JMenu("StudentDetails");
        user.setFont(new Font("monospaced",Font.BOLD,24));
        JMenuItem u1 = new JMenuItem("Student Details");
        user.setForeground(Color.RED);
        
        u1.setFont(new Font("monospaced",Font.BOLD,32));
        ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon3.png"));
        Image image4 = icon4.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        u1.setIcon(new ImageIcon(image4));
        u1.setMnemonic('C');
        u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        u1.setBackground(Color.WHITE);
        
       
        ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon4.jpg"));
        Image image5 = icon5.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        
        
        u1.addActionListener(this);
       
        JMenu report = new JMenu("UpdateDetails");
        JMenuItem r1 = new JMenuItem("Update Students");
        
        report.setForeground(Color.BLUE);
        report.setFont(new Font("monospaced",Font.BOLD,24));
        r1.setFont(new Font("monospaced",Font.BOLD,32));
        ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon5.png"));
        Image image7 = icon7.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        r1.setIcon(new ImageIcon(image7));
        r1.setMnemonic('E');
        r1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        r1.setBackground(Color.WHITE);
        
        r1.addActionListener(this);
        
        
        ImageIcon iconn = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon6.png"));
        Image imagee = iconn.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
       
        JMenu fee = new JMenu("Fee Details");
        fee.setFont(new Font("monospaced",Font.BOLD,24));
        JMenuItem s1 = new JMenuItem("Fee Structure");
        
        fee.setForeground(Color.RED);
        
        s1.setFont(new Font("monospaced",Font.BOLD,32));
        ImageIcon icon14 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon7.png"));
        Image image15 = icon14.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        s1.setIcon(new ImageIcon(image15));
        s1.setMnemonic('G');
        s1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        s1.setBackground(Color.WHITE);
        
        s1.addActionListener(this);
        
       
        ImageIcon icon16 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon8.png"));
        Image image17 = icon16.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
       
        
      
        JMenu about = new JMenu("About");
        about.setFont(new Font("monospaced",Font.BOLD,24));
        JMenuItem aboutus = new JMenuItem("About Us");
        about.setForeground(Color.BLUE);
        
        aboutus.setFont(new Font("monospaced",Font.BOLD,32));
        ImageIcon icon21 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon13.jpg"));
        Image image22 = icon21.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        aboutus.setIcon(new ImageIcon(image22));
        aboutus.setMnemonic('L');
        aboutus.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        aboutus.setBackground(Color.WHITE);
        about.add(aboutus);
        aboutus.addActionListener(this);

        JMenu exit = new JMenu("Exit");
        exit.setFont(new Font("monospaced",Font.BOLD,24));
        JMenuItem ex = new JMenuItem("Exit");
        exit.setForeground(Color.RED);
        

        ex.setFont(new Font("monospaced",Font.BOLD,32));
        ImageIcon icon11 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon12.png"));
        Image image11 = icon11.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        ex.setIcon(new ImageIcon(image11));
        ex.setMnemonic('Z');
        ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
        ex.setBackground(Color.WHITE);
        
        ex.addActionListener(this);
        exit.add(ex);
        
        
        master.add(m2);
        
        user.add(u1);
        report.add(r1);
         fee.add(s1);
      
        
      mb.add(master);
        mb.add(user);
        mb.add(report);
        mb.add(fee);
        mb.add(about);
        mb.add(exit);
        
        setJMenuBar(mb);    
        
        setFont(new Font("Senserif",Font.ITALIC,32));
        setLayout(new FlowLayout());
        setVisible(false);
    }
   @Override
    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
         if(msg.equals("New Student Admission")){
            new NewStudentAdmission().setVisible(true);
            
        }
        else if(msg.equals("Student Details")){
            new StudentsDetails().setVisible(true);
            
        }
          else if(msg.equals("Update Students")){
            new StudentUpdate().setVisible(true);
           
        }
           else if(msg.equals("Fee Structure")){
            new FEes().setVisible(true);
           
        }
        else if(msg.equals("Exit")){
            System.exit(0);
        }else if(msg.equals("About Us")){
            new AboutUs().setVisible(true);
        
    }
    
    }
    public static void main(String[] args){
        new college().setVisible(true);
    }
    
}

