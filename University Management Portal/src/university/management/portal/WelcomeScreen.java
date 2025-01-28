package university.management.portal;

import javax.swing.*; 
import java.awt.*; 

public class WelcomeScreen extends JFrame implements Runnable {
    
    Thread th;
    WelcomeScreen() {    // constructor 
        
        ImageIcon ic1= new ImageIcon(ClassLoader.getSystemResource("icons/new image.jpg")); 
        Image ic2=ic1.getImage().getScaledInstance(925,800,Image.SCALE_DEFAULT); 
        ImageIcon ic3=new ImageIcon(ic2);
        JLabel theimage= new JLabel(ic3);
        add(theimage); 
        
        th=new Thread(this); 
        th.start(); 
        setVisible(true); 
        
        int n=1;
        
        for(int i=2; i<=700; i+=5,n+=1){ 
        setLocation(750-((i)/2),450-(i/2)); 
        setSize(i+2*n,i+n/2); 
        
        try{
            
            Thread.sleep(5);
        } catch(Exception e) {} 
    }
    }
    public void run() { 
        try {
            
            Thread.sleep(3000);
            setVisible(false); 
            
            new SignIn();
          } catch(Exception e) { 
    }
    }
    public static void main (String[] args) { 
        new WelcomeScreen() ; 
    }
}    
        
