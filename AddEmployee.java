package employee.management.system;
import java.awt.*;
import javax.swing.*;  // JFrame comes in swing package

import java.util.*;
import java.awt.event.*;
public class AddEmployee extends JFrame implements ActionListener{
    
    Random ran=new Random();
    int num=ran.nextInt(999999);
    
    JTextField tfname,tffname,tfdob,tfsalary,tfaddress,tfphone,tfemail,tfdes,tfadh;
    JComboBox cbedu;
    JLabel labid;
    JButton addEmployee, back;
    AddEmployee(){
        getContentPane().setBackground(Color.GRAY);
        setLayout(null);

        JLabel heading = new JLabel("Add Employee Detail");
        heading.setBounds(320,30,500,50);
        heading.setFont(new Font("TAHOMA",Font.BOLD,25));
        add(heading); // add is imp. if we want to show in screen
        
        // name
        JLabel labelname=new JLabel("Name");
        labelname.setBounds(50,150,150,30);
        labelname.setFont(new Font("TAHOMA",Font.PLAIN,20));
        add(labelname);
        
        tfname=new JTextField();
        tfname.setBounds(200,150,150,30);
        add(tfname);
        
        // father's name
         JLabel labelfname=new JLabel("Father's Name");
        labelfname.setBounds(400,150,150,30);
        labelfname.setFont(new Font("TAHOMA",Font.PLAIN,20));
        add(labelfname);
        
         tffname=new JTextField();
        tffname.setBounds(600,150,150,30);
        add(tffname);
        
        //dob
        JLabel labeldob = new JLabel("DOB (DD/MM/YYYY)");
        labeldob.setBounds(50, 200, 150, 30);
        labeldob.setFont(new Font("TAHOMA",Font.PLAIN,20));
        add(labeldob);

         tfdob = new JTextField();
        tfdob.setBounds(200, 200, 150, 30);
        add(tfdob);
        
        // salary
        JLabel labelsalary=new JLabel("SALARY");
        labelsalary.setBounds(400,200,150,30);
        labelsalary.setFont(new Font("TAHOMA",Font.PLAIN,20));
        add(labelsalary);
        
         tfsalary=new JTextField();
        tfsalary.setBounds(600,200,150,30);
        add(tfsalary);
        
        //  address
         JLabel labeladdress=new JLabel("ADDRESS");
        labeladdress.setBounds(50,250,150,30);
        labeladdress.setFont(new Font("TAHOMA",Font.PLAIN,20));
        add(labeladdress);
        
         tfaddress=new JTextField();
        tfaddress.setBounds(200,250,150,30);
        add(tfaddress);
        
        
        // PHONE
        
          JLabel labelphone=new JLabel("PHONE");
        labelphone.setBounds(400,250,150,30);
        labelphone.setFont(new Font("TAHOMA",Font.PLAIN,20));
        add(labelphone);
        
         tfphone=new JTextField();
        tfphone.setBounds(600,250,150,30);
        add(tfphone);
        
        // email
         JLabel labelemail=new JLabel("EMAIL");
        labelemail.setBounds(50,300,150,30);
        labelemail.setFont(new Font("TAHOMA",Font.PLAIN,20));
        add(labelemail);
        
         tfemail=new JTextField();
        tfemail.setBounds(200,300,150,30);
        add(tfemail);
        
        // HG EDU

          JLabel labeledu=new JLabel("HIGHEST EDUCATION");
        labeledu.setBounds(400,300,150,30);
        labeledu.setFont(new Font("TAHOMA",Font.PLAIN,20));
        add(labeledu);
        
         String courses[]={"BTECH","BBA","MTECH","BCA","MTECH","B.COM","BSC","MSC","PHD"};
         cbedu=new JComboBox(courses);
        cbedu.setBounds(600,300,150,30);
        add(cbedu);
        
            //POST
          JLabel labeldesign=new JLabel("DESIGNATION");
        labeldesign.setBounds(50,350,150,30);
        labeldesign.setFont(new Font("TAHOMA",Font.PLAIN,20));
        add(labeldesign);
        
         tfdes=new JTextField();
        tfdes.setBounds(200,350,150,30);
        add(tfdes);
        
        
        // addhar
        
          JLabel labeladh=new JLabel("ADDHAR NO.");
        labeladh.setBounds(400,350,150,30);
        labeladh.setFont(new Font("TAHOMA",Font.PLAIN,20));
        add(labeladh);
        
         tfadh=new JTextField();
        tfadh.setBounds(600,350,150,30);
        add(tfadh);
            
        // employee id
           JLabel labelid=new JLabel("EMPLOYEE ID");
        labelid.setBounds(50,400,150,30);
        labelid.setFont(new Font("TAHOMA",Font.PLAIN,20));
        add(labelid);
        
        labid=new JLabel(""+num); 
        labid.setBounds(200,400,150,30);
        labid.setFont(new Font("TAHOMA",Font.PLAIN,20));
        add(labid);
        
         addEmployee = new JButton("ADD DETAILS"); //button on add employee
        addEmployee.setBounds(250, 550, 150, 40); // x,y,width,height
        addEmployee.addActionListener(this);
        addEmployee.setBackground(Color.BLACK);
//        addEmployee.setForeground(Color.WHITE); 
        add(addEmployee);
                                  
         back = new JButton("BACK"); //button on add employee
        back.setBounds(450, 550, 150, 40); 
        back.addActionListener(this);
        back.setBackground(Color.BLACK);
//        back.setForeground(Color.WHITE); 
        add(back);
        setSize(900,700);
        setLocation(300,50);
        setVisible(true);
        
    }
       public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==addEmployee){
                String name=tfname.getText();
                String fname=tffname.getText();
                String dob= tfdob.getText();
                String salary=tfsalary.getText();
                String address = tfaddress.getText();
                String phone = tfphone.getText();
                String email = tfemail.getText();
                String education = (String) cbedu.getSelectedItem();
                String designation = tfdes.getText();
                String aadhar = tfadh.getText();
                String empId = labid.getText();
                
                
                 try {
                Conn conn = new Conn();
                String query = "insert into employee values('"+name+"', '"+fname+"', '"+dob+"', '"+salary+"', '"+address+"', '"+phone+"', '"+email+"', '"+education+"', '"+designation+"', '"+aadhar+"', '"+empId+"')";
                conn.s.executeUpdate(query); //dml command
                JOptionPane.showMessageDialog(null, "Details added successfully");
                setVisible(false);
                new Home();
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            }
            else{
                setVisible(false);
                new Home();
            }
        
    }
    
    
    public static void main(String []args){
        new AddEmployee();
    
}
}
