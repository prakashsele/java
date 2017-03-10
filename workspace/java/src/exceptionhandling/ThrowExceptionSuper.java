package exceptionhandling;

class invalidname extends Exception
{
	invalidname(String S)
	{
		super(S);
	}

}

public class ThrowExceptionSuper  {
	void status(int age) throws invalidname
	{
		if(age>20)
		{
			System.out.println("Eligible to Marry");
		}
		else
		{
			throw new invalidname("Not eligible to Marry");
		}
	}

	public static void main(String[] args) throws invalidname 
	{
		new ThrowExceptionSuper().status(10);
	}

}
