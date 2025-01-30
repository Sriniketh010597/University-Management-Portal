package university.management.portal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*; 

public class SignIn extends JFrame implements ActionListener{

    JButton signin, exit;
    JTextField signinusername, signinpassword;
    
    SignIn () {
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(45, 25, 105, 25);
        add(lblusername);
        
        signinusername = new JTextField();
        signinusername.setBounds(155, 25, 155, 25);
        add(signinusername);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(45, 75, 105, 25);
        add(lblpassword);
        
        signinpassword = new JPasswordField();
        signinpassword.setBounds(155, 75, 155, 25);
        add(signinpassword);
        
        signin = new JButton("signin");
        signin.setBounds(40, 140, 120, 30);
        signin.setBackground(Color.BLACK);
        signin.setForeground(Color.WHITE);
        signin.addActionListener(this);
        signin.setFont(new Font("Calibre", Font.BOLD, 15));
        add(signin);
        
        exit = new JButton("exit");
        exit.setBounds(180, 140, 120, 30);
        exit.setBackground(Color.BLACK);
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        exit.setFont(new Font("Calibre", Font.BOLD, 15));
        add(exit);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 200, 200);
        add(image);
        
        setSize(610, 315);
        setLocation(510, 260);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == signin) {
            
            String username= signinusername.getText();
            String password= signinpassword.getText();  
            String query = "select * from signin where username='"+username+"' and password='"+password+"'";
            
            try {
                Connectivity conn =new Connectivity();
                ResultSet result = conn.st.executeQuery(query);
                
                if(result.next()) {
                    setVisible(false);
                    new ThirdClass();
                    
                } else {
                    
                    JOptionPane.showMessageDialog(null, "Invalid username or password"); 
                    setVisible(false); 
              
        }       
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == exit) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new SignIn();
    }
}
