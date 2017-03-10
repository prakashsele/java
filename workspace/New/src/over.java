
public class over {

	void m1()
	{
		System.out.println("parent method");
	}
}

class child extends over
{
	void m2()
	{
		System.out.println("parent method");
	}
	public static void main(String[]args)
	{
		child c =new child();
		c.m2();
		c.m1();
	}
}