package employee.management.system; // class ka address mention
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Splash extends JFrame implements ActionListener{

    Splash() {
       
        setLayout(null); //apna layout
        getContentPane().setBackground(Color.CYAN);
     
        
        
        JLabel heading =new JLabel ("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(80,30,1200,60);
        heading.setFont(new Font("serif",Font.BOLD,60));
        heading.setForeground(Color.RED);
        add(heading);
        
        ImageIcon i1 = new ImageIcon(
        ClassLoader.getSystemResource("icons/front.jpg")
);
        Image i2=i1.getImage().getScaledInstance(1100, 700,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(50,100,1050,500);
        add(image);
        
        JButton c = new JButton("CLICK HERE TO CONTINUE");
        c.setBounds(350, 380, 350, 70);
        c.setBackground(Color.YELLOW);
        c.setForeground(Color.black);
        
        c.addActionListener(this);
         c.setFont(new Font("Arial", Font.BOLD, 18));
        image.add(c);    
        
        
        setSize(1170,650); // Sets the width and height of the window (in pixels)
        setLocation(200,50); // Sets the position where the window appears on the screen
// 200 px from left edge, 50 px from top edge
        setVisible(true); // Makes the window visible on the screen
        
        
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }

   public static void main(String[] args) {
     new Splash();
     
   }
}
