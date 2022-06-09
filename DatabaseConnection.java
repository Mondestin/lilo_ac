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
import javax.swing.*;
import java.sql.*;
import java.awt.*;

public class DatabaseConnection 
{
    
     Connection connection = null;

   // static final String JDBC_DRIVER = "org.apache.derby.jdbc.ClientDriver";
    static final String DATABASE_URL = "jdbc:derby://localhost:1527/LiLoDatabase";


    public DatabaseConnection()
    {

    }//null constructor

    public Connection  dbConnect()
    {

    	try
    		{

              //Class.forName(JDBC_DRIVER);

              connection = DriverManager.getConnection(DATABASE_URL, "sydney", "sydney");
    	    }

    	   catch (SQLException e)
    	   {
        	JOptionPane.showMessageDialog(null,"Problem connecting to the database","error",JOptionPane.WARNING_MESSAGE);
    	   }

    	   	return   connection;
    }//end of connect to database
}
