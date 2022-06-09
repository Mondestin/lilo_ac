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
import java.util.regex.*;

public class ValidateStudent 
{
   // public ValidateStudent(String sN,String sn, String sS, String sC, String sE)
    //	{
    //	super(sN,sn,sS,sE,sC);
    	//Validation();
    	//}
 public boolean ValidateStNumber(String sNg)
    {
    	if(sNg.startsWith("1") || sNg.startsWith("2") && sNg.length() == 9)
    	{
    		return true;
    	}
    	else
    	{
    		JOptionPane.showMessageDialog(null,"Student number must satrt with 1 or 2 and must be 9 digits","ERROR",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
    }
 
   public boolean ValidateStName(String sng)
    {
    	if(sng.substring(0,1).matches("[A-Z]"))
    	{
    		return true;
    	}
    	else
    	{
    		JOptionPane.showMessageDialog(null," The name must start with a capital letter ","ERROR",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
    }
   public boolean ValidateStSurname(String sSg)
    {
    	if(sSg.substring(0,1).matches("[A-Z]"))
    	{
    		return true;
    	}
    	else
    	{
    		JOptionPane.showMessageDialog(null,"The surname must start with a capital letter ","ERROR",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
    }
    public boolean ValidateStContact(String sCg)
    {
    	if(sCg.length()== 10)
    	{
    		return true;
    	}
    	else
    	{
    		JOptionPane.showMessageDialog(null,"The contact number must be 10 digits ","ERROR",JOptionPane.ERROR_MESSAGE);
    		return false;
    	}
    }
    public boolean ValidateStEmail(String sEg)
    {
        	String emailCheck = "^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9_+&*-]+)*@" +"(?:[a-zA-Z0-9-]+\\.)+[a-z" +"A-Z]{2,7}$";

      		Pattern pattern = Pattern.compile(emailCheck);
      		Matcher matcher = pattern.matcher(sEg);
                
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
