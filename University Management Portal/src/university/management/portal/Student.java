package university.management.portal;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;


public class Student extends JFrame {
    
    JTextField textname, textfname, textaddress, textphone, textemail, textx, textxii, textaadhar;
    JLabel labelrollnumber;
    JDateChooser datedob;
    JComboBox boxcourse, boxbranch;
    JButton addbutton, discardbutton;
    
    Random random = new Random();
    long firstfour = Math.abs((random.nextLong() % 9000L) + 1000L);
    
    Student() {
        
        setSize(900, 700);
        setLocation(350, 50);
        
        setLayout(null);
        
        JLabel theheading = new JLabel("New Student Details");
        theheading.setBounds(310, 30, 500, 50);
        theheading.setFont(new Font("serif", Font.BOLD, 30));
        add(theheading);
        
        JLabel labelname = new JLabel("Name");
        labelname.setBounds(50, 150, 100, 30);
        labelname.setFont(new Font("serif", Font.BOLD, 20));
        add(labelname);
        
        textname = new JTextField();
        textname.setBounds(200, 150, 150, 30);
        add(textname);
        
        JLabel labelfname = new JLabel("Father's Name");
        labelfname.setBounds(400, 150, 200, 30);
        labelfname.setFont(new Font("serif", Font.BOLD, 20));
        add(labelfname);
        
        textfname = new JTextField();
        textfname.setBounds(600, 150, 150, 30);
        add(textfname);
        
        JLabel labelrollno = new JLabel("Roll Number");
        labelrollno.setBounds(50, 200, 200, 30);
        labelrollno.setFont(new Font("serif", Font.BOLD, 20));
        add(labelrollno);
        
        labelrollnumber = new JLabel("1533"+firstfour);
        labelrollnumber.setBounds(200, 200, 200, 30);
        labelrollnumber.setFont(new Font("serif", Font.BOLD, 20));
        add(labelrollnumber);
        
        JLabel labeldob = new JLabel("Date of Birth");
        labeldob.setBounds(400, 200, 200, 30);
        labeldob.setFont(new Font("serif", Font.BOLD, 20));
        add(labeldob);
        
        datedob = new JDateChooser();
        datedob.setBounds(600, 200, 150, 30);
        add(datedob);
        
        JLabel labeladdress = new JLabel("Address");
        labeladdress.setBounds(50, 250, 200, 30);
        labeladdress.setFont(new Font("serif", Font.BOLD, 20));
        add(labeladdress);
        
        textaddress = new JTextField();
        textaddress.setBounds(200, 250, 150, 30);
        add(textaddress);
        
        JLabel labelphone = new JLabel("Phone");
        labelphone.setBounds(400, 250, 200, 30);
        labelphone.setFont(new Font("serif", Font.BOLD, 20));
        add(labelphone);
        
        textphone = new JTextField();
        textphone.setBounds(600, 250, 150, 30);
        add(textphone);
        
        JLabel labelemail = new JLabel("Email Id");
        labelemail.setBounds(50, 300, 200, 30);
        labelemail.setFont(new Font("serif", Font.BOLD, 20));
        add(labelemail);
        
        textemail = new JTextField();
        textemail.setBounds(200, 300, 150, 30);
        add(textemail);
        
        JLabel labelx = new JLabel("Class X (%)");
        labelx.setBounds(400, 300, 200, 30);
        labelx.setFont(new Font("serif", Font.BOLD, 20));
        add(labelx);
        
        textx = new JTextField();
        textx.setBounds(600, 300, 150, 30);
        add(textx);
        
        JLabel labelxii = new JLabel("Class XII (%)");
        labelxii.setBounds(50, 350, 200, 30);
        labelxii.setFont(new Font("serif", Font.BOLD, 20));
        add(labelxii);
        
        textxii = new JTextField();
        textxii.setBounds(200, 350, 150, 30);
        add(textxii);
        
        JLabel labelaadhar = new JLabel("Aadhar Number");
        labelaadhar.setBounds(400, 350, 200, 30);
        labelaadhar.setFont(new Font("serif", Font.BOLD, 20));
        add(labelaadhar);
        
        textaadhar = new JTextField();
        textaadhar.setBounds(600, 350, 150, 30);
        add(textaadhar);
        
        JLabel labelcourse = new JLabel("Course");
        labelcourse.setBounds(50, 400, 200, 30);
        labelcourse.setFont(new Font("serif", Font.BOLD, 20));
        add(labelcourse);
        
        String course[] = {"B.Tech", "BBA", "BCA", "Bsc", "Msc", "MBA", "MCA", "MCom", "MA", "BA"};
        boxcourse = new JComboBox(course);
        boxcourse.setBounds(200, 400, 150, 30);
        boxcourse.setBackground(Color.WHITE);
        add(boxcourse);
        
        JLabel labelbranch = new JLabel("Branch");
        labelbranch.setBounds(400, 400, 200, 30);
        labelbranch.setFont(new Font("serif", Font.BOLD, 20));
        add(labelbranch);
        
        String branch[] = {"Computer Science", "Electronics", "Mechanical", "Civil", "IT"};
        boxbranch = new JComboBox(branch);
        boxbranch.setBounds(600, 400, 150, 30);
        boxbranch.setBackground(Color.WHITE);
        add(boxbranch);
        
        addbutton = new JButton("Add");
        addbutton.setBounds(250, 550, 120, 30);
        addbutton.setBackground(Color.BLACK);
        addbutton.setForeground(Color.WHITE);
        addbutton.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(addbutton);
        
        discardbutton = new JButton("Discard");
        discardbutton.setBounds(450, 550, 120, 30);
        discardbutton.setBackground(Color.BLACK);
        discardbutton.setForeground(Color.WHITE);
        discardbutton.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(discardbutton);
        
        setVisible(true);
    
        
    }
      public static void main(String [] args){
        
        new Student(); 
        
    }   
}