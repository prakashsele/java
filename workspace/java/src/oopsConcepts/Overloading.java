package oopsConcepts;

public class Overloading {

	public static void main(String[] args) 
	{
		BC obj = new BC ();
		obj.show();
				
	}

}

class BC
{
	public void show()
	{
		System.out.println("Show with no paramater");
	}
	public void show(int i)
	{
		System.out.println("Show with one paramater" +i );
	}
	
}