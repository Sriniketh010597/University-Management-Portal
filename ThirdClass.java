package university.management.portal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ThirdClass extends JFrame implements ActionListener {

    ThirdClass() {
        setSize(1920, 1080);
        
        ImageIcon ic1 = new ImageIcon(ClassLoader.getSystemResource("icons/third class.jpg"));
        Image im2 = ic1.getImage().getScaledInstance(1900, 900, Image.SCALE_DEFAULT);
        ImageIcon ic3 = new ImageIcon(im2);
        JLabel image = new JLabel(ic3);
        add(image);
        
        JMenuBar mnb = new JMenuBar();
        
        // New Information
        JMenu theinfo = new JMenu("New Information");
        theinfo.setForeground(Color.blue);
        mnb.add(theinfo);
        
        JMenuItem staffInformation = new JMenuItem("New Staff Information");
        staffInformation.setBackground(Color.white);
        staffInformation.addActionListener(this);
        theinfo.add(staffInformation);
        
        JMenuItem thestudentInformation = new JMenuItem("New Student Information");
        thestudentInformation.setBackground(Color.white);
        thestudentInformation.addActionListener(this);
        theinfo.add(thestudentInformation);
        
        // View the Details
        JMenu det = new JMenu("View Details"); 
        det.setForeground(Color.red);
        mnb.add(det);
        
        JMenuItem staffdet = new JMenuItem("View Staff Details");
        staffdet.setBackground(Color.white);
        staffdet.addActionListener(this);
        det.add(staffdet);
        
        JMenuItem studentdet = new JMenuItem("View Student Details");
        studentdet.setBackground(Color.white);
        studentdet.addActionListener(this);
        det.add(studentdet);
        
        // Application for leave
        JMenu leaveapplication = new JMenu("Apply for Leave");
        leaveapplication.setForeground(Color.blue);
        mnb.add(leaveapplication);
        
        JMenuItem staffleaveapplication = new JMenuItem("Staff Leave");
        staffleaveapplication.setBackground(Color.white);
        staffleaveapplication.addActionListener(this);
        leaveapplication.add(staffleaveapplication);
        
        JMenuItem studleaveapplication = new JMenuItem("Student Leave");
        studleaveapplication.setBackground(Color.white);
        studleaveapplication.addActionListener(this);
        leaveapplication.add(studleaveapplication);
        
        // The Leave Details
        JMenu leaveDet = new JMenu("Leave Details");
        leaveDet.setForeground(Color.red);
        mnb.add(leaveDet);
        
        JMenuItem staffleavedet = new JMenuItem("Staff Leave Details");
        staffleavedet.setBackground(Color.white);
        staffleavedet.addActionListener(this);
        leaveDet.add(staffleavedet);
        
        JMenuItem studentleavedet = new JMenuItem("Student Leave Details");
        studentleavedet.setBackground(Color.white);
        studentleavedet.addActionListener(this);
        leaveDet.add(studentleavedet);
        
        // Examination details
        JMenu theexamination = new JMenu("Examination");
        theexamination.setForeground(Color.BLUE);
        mnb.add(theexamination);
        
        JMenuItem examinationdet = new JMenuItem("Examination Results");
        examinationdet.setBackground(Color.white);
        examinationdet.addActionListener(this);
        theexamination.add(examinationdet);
        
        JMenuItem enterthegrades = new JMenuItem("Enter grades");
        enterthegrades.setBackground(Color.white);
        enterthegrades.addActionListener(this);
        theexamination.add(enterthegrades);
        
        // Update Information
        JMenu updatetheInformation = new JMenu("Update Details");
        updatetheInformation.setForeground(Color.red);
        mnb.add(updatetheInformation);
        
        JMenuItem updatestaffinformation = new JMenuItem("Update Staff Details");
        updatestaffinformation.setBackground(Color.white);
        updatestaffinformation.addActionListener(this);
        updatetheInformation.add(updatestaffinformation);
        
        JMenuItem updatestudinformation = new JMenuItem("Update Student Details");
        updatestudinformation.setBackground(Color.white);
        updatestudinformation.addActionListener(this);
        updatetheInformation.add(updatestudinformation);
        
        // Tution fee
        JMenu tutionfee = new JMenu("Tution Fee Details");
        tutionfee.setForeground(Color.blue);
        mnb.add(tutionfee);
        
        JMenuItem tutionfeestructure = new JMenuItem("Tution Fee Structure");
        tutionfeestructure.setBackground(Color.white);
        tutionfeestructure.addActionListener(this);
        tutionfee.add(tutionfeestructure);
        
        JMenuItem tutionfeesform = new JMenuItem("Student Fee Form");
        tutionfeesform.setBackground(Color.white);
        tutionfeesform.addActionListener(this);
        tutionfee.add(tutionfeesform);
        
        // Resources
        JMenu resources = new JMenu("Resources");
        resources.setForeground(Color.red);
        mnb.add(resources);
        
        JMenuItem notebook = new JMenuItem("Notebook");
        notebook.setBackground(Color.white);
        notebook.addActionListener(this);
        resources.add(notebook);
        
        JMenuItem calculatordevice = new JMenuItem("Calculator");
        calculatordevice.setBackground(Color.white);
        calculatordevice.addActionListener(this);
        resources.add(calculatordevice);
        
        // about
        JMenu theabouttab = new JMenu("About");
        theabouttab.setForeground(Color.blue);
        mnb.add(theabouttab);
        
        JMenuItem ab = new JMenuItem("About");
        ab.setBackground(Color.white);
        ab.addActionListener(this);
        theabouttab.add(ab);
        
        // Close
        JMenu close = new JMenu("Close");
        close.setForeground(Color.red);
        mnb.add(close);
        
        JMenuItem clo = new JMenuItem("Close");
        clo.setBackground(Color.white);
        clo.addActionListener(this);
        close.add(clo);
        
        setJMenuBar(mnb);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();
        
        if (msg.equals("Close")) {
            setVisible(false);
        } else if (msg.equals("Calculator")) {
            try {
                Runtime.getRuntime().exec("Calc.exe");
            } catch (Exception e) {
                
            }
        } else if (msg.equals("Notebook")) {
            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception e) {
                
            }
        } 
        
}
        
    public static void main(String[] args) {
        new ThirdClass();
    
    } 

}