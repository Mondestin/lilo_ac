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
public class LecturerAccess 
{
        private String LecturerNumber;
	private String LecturerSurname;
	private String LecturerName;
	private String LecturerEmail;
        private String LecturerContact;
     public LecturerAccess()
    	{

    	}//null argument constractor
    
    public LecturerAccess(String lN,String ln, String lS, String lC, String lE)
    {
    	LecturerNumber = lN;
    	LecturerSurname = lS;
    	LecturerName = ln;
    	LecturerEmail = lE;
        LecturerContact = lC;   	
    }//four argument constructor
    ///////ACCESSORS//////////////////////////////////
     public void setLecturerNumber(String lN)
    {
    	LecturerNumber = lN;
    }//setStudentNumber

    public void setLecturerSurname(String lS)
    {
    	LecturerSurname = lS;
    }//setStudentSurname

    public void setLecturerName(String ln)
    {
    	LecturerName = ln;
    }//setStudentName

    public void setLecturerEmail(String lE)
    {
    	LecturerEmail = lE;
    }//setStudentEmail
   
    public void setLecturerContact(String lC)
    {
    	LecturerContact = lC;
    }//setstudentContact
   
    
////////////MUTATORS////////////////////////////////

    public String getLecturerNumber()
    {
    	return LecturerNumber;
    }//getStudentNumber

    public String getLecturerSurname()
    {
    	return LecturerSurname;
    }//getStudentSurname

    public String getLecturerName()
    {
    	return LecturerName;
    }//getStudentName

    public String getLecturerEmail()
    {
    	return LecturerEmail;
    }//getEmail
    public String getLecturerContact()
    {
    	return LecturerContact;
    }//getContact
     
    public String toString()
    {
        return String.format("%s %s %s %s %s", getLecturerNumber(), getLecturerName(),getLecturerSurname(), getLecturerContact(), getLecturerEmail());
    }
}
