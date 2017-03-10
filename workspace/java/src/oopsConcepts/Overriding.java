package oopsConcepts;


public class Overriding {

	public static void main(String[] args)
	{
		B obj = new B();
		obj.show();
	}

}

class A //Method Overriding, late binding, dynamic binding, Runtime Polymorphism
{
	public void show()
	{
		System.out.println("In show A");
	}
}
class B extends A
{
	public void show()
	{
		System.out.println("In show B");
	}
}