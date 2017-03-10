package oopsConcepts;


// Abstract class is a class which contains at least one abstract menthod
// we need to use a key word called abstract
// use of abstract class: We can achieve the abstraction
// is a concept which is going to show the functanality by hiding implementation details.
// contains both abstact and concrete methods 
// define the member variables like private, public
//







public class AbstractClass {

	public static void main(String[] args)
	{
		Omphone obj = new Varunphone();
		obj.call();
		obj.cook();
		obj.move();
		obj.dance();
		
	}
}

abstract class Omphone //Abstract
{
	public void call()
	{
		System.out.println("calling....");
	}
	public abstract void move();
	public abstract void dance();
	public abstract void cook();
	
}

class Varunphone extends Omphone // concrete
{
	public void move()
	{
		System.out.println("Moving...");
	}
	public void dance()
	{
		System.out.println("Dancing...");
	}
	public void cook()
	{
		System.out.println("Cooking...");
	}

}