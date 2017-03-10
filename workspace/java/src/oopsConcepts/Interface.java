package oopsConcepts;

// will contains by default all the methods are abstract methods
// default public methods 
// contains only abstact methods 
//Contains only public variable members
// we can achieve multiple inheritence in Java
// methods does not have body
// 






interface Abc
{
	void show();
}
class AbcImpl implements Abc
{
	public void show()
	{
		System.out.println("show");
	}
}
public class Interface 
{
	public static void main(String[] args)
	{
		Abc obj = new AbcImpl();
		obj.show();
	}
}
