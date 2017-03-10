package newpackage;

public class Employee {

	
    private String firstName;
    public Employee()
    {
    }
 
   
    public Employee (String newFirstName, String newLastName)
    {
        firstName = newFirstName;
    }
 
    
    public String getFirstName()
    {
        return firstName;
    }
 
    //This method allows the contents of firstName
    //to be changed to store a different String value, should that be required
    public void setFirstName (String newFirstName)
    {
        firstName = newFirstName;
    }
}
