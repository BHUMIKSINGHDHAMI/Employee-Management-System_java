package employee.management.system;
import java.awt.*;
import javax.swing.*; // package import(jframe)
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{ // all 4 buttons have same listener()
   
    JButton addEmployee,viewEmployee,updateEmployee,removeEmployee;// globally scope
    Home() {
        setLayout(null);

        ImageIcon i1 = new ImageIcon(
            ClassLoader.getSystemResource("icons/home.jpg")
        );
        Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT); // awt package ma hai
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1120, 630); // frame origin
        add(image);

        JLabel heading = new JLabel("Employee Management System");
  
        heading.setBounds(600, 20, 1000, 40); 
        
        heading.setFont(new Font("TAHOMA", Font.BOLD, 25)); // changing the font size
        heading.setForeground(Color.WHITE);
        image.add(heading); // image ka upper part ma addd it

        // ADD EMPLOYEE
         addEmployee = new JButton("ADD EMPLOYEE"); //button on add employee
        addEmployee.setBounds(550, 80, 200, 40); // x,y,width,height
        addEmployee.addActionListener(this);
        addEmployee.setFont(new Font("TAHOMA", Font.BOLD, 14));
        image.add(addEmployee);

        // VIEW EMPLOYEE
         viewEmployee = new JButton("VIEW EMPLOYEES");
        viewEmployee.setBounds(800, 80, 200, 40);
        viewEmployee.addActionListener(this);

        viewEmployee.setFont(new Font("TAHOMA", Font.BOLD, 14));
        image.add(viewEmployee);

        // UPDATE EMPLOYEE
         updateEmployee = new JButton("UPDATE EMPLOYEE");
        updateEmployee.setBounds(550, 140, 200, 40);
        updateEmployee.addActionListener(this);

        updateEmployee.setFont(new Font("TAHOMA", Font.BOLD, 14));
        image.add(updateEmployee);

        // REMOVE EMPLOYEE
         removeEmployee = new JButton("REMOVE EMPLOYEE");
        removeEmployee.setBounds(800, 140, 200, 40);
        removeEmployee.addActionListener(this);
        removeEmployee.setFont(new Font("TAHOMA", Font.BOLD, 14));
        image.add(removeEmployee);

        setSize(1120, 630);
        setLocation(250, 100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==addEmployee) { // click event source  
            setVisible(false);
            new AddEmployee();
        }
        else if(ae.getSource()==viewEmployee){
            setVisible(false);
            new ViewEmployee();
        }
        else if(ae.getSource()==updateEmployee){
            setVisible(false);
            new ViewEmployee();
        }
        else{
        setVisible(false);
            new RemoveEmployee();
        
        }
    }

   public static void main(String[] args) {
        new Home();
   }
}
