/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liloac;

/**
 *
 * @author Mondestin
 */
import java.sql.*;
import java.sql.DriverManager;
//import java.sql.SQLException;


public class GetDataFromDatabase 
{
    Connection myConnect =null;
    Statement myState=null;
    ResultSet myReset=null; 
    String demand ="Select * from sydney.lecturers";
    
    
    
    public GetDataFromDatabase()
    {
    try{
            myConnect =DriverManager.getConnection("jdbc:derby://localhost:1527/LiLoDatabase","sydney","sydney");
            myState=myConnect.createStatement();
            myReset=myState.executeQuery(demand);
            while(myReset.next())
            {
                int id =myReset.getInt(1);
                String name =myReset.getString(2);
                String surname=myReset.getString(3);
                int contact=myReset.getInt(4);
                String email=myReset.getString(5);
                System.out.println(id+ name + surname + contact + email);
            
            
            }
        }
    catch(SQLException e)
    {
        e.printStackTrace();
    }
    
    
    
    
    }
}
