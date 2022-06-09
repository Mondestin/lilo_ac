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
public class StudentAccess 
{
    	private String studentNumber;
	private String studentSurname;
	private String studentName;
	private String studentEmail;
        private String studentContact;
        
        public StudentAccess()
    	{

    	}//null argument constractor
    
    public StudentAccess(String sN,String sn, String sS, String sC, String sE)
    {
    	studentNumber = sN;
    	studentSurname = sS;
    	studentName = sn;
    	studentEmail = sE;
        studentContact = sC;   	
    }//four argument constructor
     

///////ACCESSORS//////////////////////////////////
     public void setStudentNumber(String sN)
    {
    	studentNumber = sN;
    }//setStudentNumber

    public void setStudentSurname(String sS)
    {
    	studentSurname = sS;
    }//setStudentSurname

    public void setStudentName(String sn)
    {
    	studentName = sn;
    }//setStudentName

    public void setStudentEmail(String sE)
    {
    	studentEmail = sE;
    }//setStudentEmail
   
    public void setStudentContact(String sC)
    {
    	studentContact = sC;
    }//setstudentContact
   
    
////////////MUTATORS////////////////////////////////

    public String getStudentNumber()
    {
    	return studentNumber;
    }//getStudentNumber

    public String getStudentSurname()
    {
    	return studentSurname;
    }//getStudentSurname

    public String getStudentName()
    {
    	return studentName;
    }//getStudentName

    public String getStudentEmail()
    {
    	return studentEmail;
    }//getEmail
    public String getStudentContact()
    {
    	return studentContact;
    }//getContact
     
    public String toString()
    {
        return String.format("%s %s %s %s %s", getStudentNumber(), getStudentName(),getStudentSurname(), getStudentContact(), getStudentEmail());
    } 
}
