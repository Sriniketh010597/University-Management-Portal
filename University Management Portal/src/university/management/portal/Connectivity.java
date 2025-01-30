package university.management.portal;

import java.sql.*; 

public class Connectivity {
    
    Connection conn; 
    Statement st;
    Connectivity() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            conn= DriverManager.getConnection("jdbc:mysql:///universitymanagementportal", "root", "Srinikethven");
            st=conn.createStatement(); 
        }catch(Exception e) { 
            e.printStackTrace(); 
        }
    }
    
    
}
