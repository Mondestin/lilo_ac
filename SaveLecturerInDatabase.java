/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liloac;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Mondestin
 */
public class SaveLecturerInDatabase 
{
     public SaveLecturerInDatabase()
    {

    }//null constructor

    public SaveLecturerInDatabase(int lN, String ln, String lS, int lC, String lE)
    {

        Connection connection = null;
        Statement statement = null;


        try {

			DatabaseConnection myDatabase = new DatabaseConnection();

			connection = myDatabase.dbConnect();

            statement = connection.createStatement();


            statement.executeUpdate("INSERT INTO lecturers (ID, NAME, SURNAME, CONTACT, EMAIL) VALUES ('" + lN + "', '" + ln + "', '"+ lC +"', '"+ lE +"');");

            JOptionPane.showMessageDialog(null, "Lecturer inserted successfully into database");

        }
        	catch (SQLException e)
        		{
                  e.printStackTrace();
         		}

         	finally
                                {
                              try {
                		statement.close();
                		connection.close();
            		  }

                  catch (SQLException ex)
            	     {
                       ex.printStackTrace();
                     }
                }

    }
    
}
