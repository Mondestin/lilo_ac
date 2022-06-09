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

public class SaveStudentInDatabase
{
    public SaveStudentInDatabase()
    {

    }//null constructor

    public SaveStudentInDatabase(int sN, String sn, String sS, int sC, String sE, String sub)
    {

        Connection connection = null;
        Statement statement = null;


        try {

			DatabaseConnection connectDatabase = new DatabaseConnection();

			connection = connectDatabase.dbConnect();

            statement = connection.createStatement();


            statement.executeUpdate("INSERT INTO Students (Number, Name, Surname, Contact, Email, Subject) VALUES ( sN , '" + sN + "', '" + sS + "', sC , '" + sE + "', '" + sub + "');");

            JOptionPane.showMessageDialog(null, "Student inserted successfully into database");

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
