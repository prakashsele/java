 package oopsConcepts;


 class Add
{
	int num1=5, num2=6, result;
	public void sum()
	{
		result = num1+ num2;
		System.out.println(result);
	}
}

class InheritanceSingleLevel extends Add
{
	public void sub()
	{
		int result1 = num1 - num2;
		System.out.println(result1);
	}
	
	public static void main(String[]args)
	{
		InheritanceSingleLevel t=new InheritanceSingleLevel();
		
		t.sub();
		t.sum();
	}
	
}

/*public class InheritanceSingleLevel {

	public static void main(String[] args) {
		Addsub obj = new Addsub();
		
	}

}*/