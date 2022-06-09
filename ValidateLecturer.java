/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liloac;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Mondestin
 */
public class ValidateLecturer 
{
    public boolean ValidateStNumber(String lNg)
    {
    	if(lNg.startsWith("1") || lNg.startsWith("2") && lNg.length() == 9)
    	{
    		return true;
    	}
    	else
    	{
    		JOptionPane.showMessageDialog(null,"The ID must must be 9 digits","ERROR",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
    }
 
   public boolean ValidateStName(String lng)
    {
    	if(lng.substring(0,1).matches("[A-Z]"))
    	{
    		return true;
    	}
    	else
    	{
    		JOptionPane.showMessageDialog(null," The name must start with a capital letter ","ERROR",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
    }
   public boolean ValidateStSurname(String lSg)
    {
    	if(lSg.substring(0,1).matches("[A-Z]"))
    	{
    		return true;
    	}
    	else
    	{
    		JOptionPane.showMessageDialog(null,"The surname must start with a capital letter ","ERROR",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
    }
    public boolean ValidateStContact(String lCg)
    {
    	if(lCg.length()== 10)
    	{
    		return true;
    	}
    	else
    	{
    		JOptionPane.showMessageDialog(null,"The contact number must be 10 digits ","ERROR",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
    }
    public boolean ValidateStEmail(String lEg)
    {
        	String emailCheck = "^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9_+&*-]+)*@" +"(?:[a-zA-Z0-9-]+\\.)+[a-z" +"A-Z]{2,7}$";

      		Pattern pattern = Pattern.compile(emailCheck);
      		Matcher matcher = pattern.matcher(lEg);
                
    	if(matcher.matches())
    	{
    		return true;
    	}
    	else
    	{
    		JOptionPane.showMessageDialog(null, "Please enter a Valid email address","Warning", JOptionPane.WARNING_MESSAGE);
    		return false;
    	}
    }
    
}
