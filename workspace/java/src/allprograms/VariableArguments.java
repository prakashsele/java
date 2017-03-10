package allprograms;

public class VariableArguments {

	public static void main(String[] args) {
		
		Display d = new Display();
		d.show (8,9,0);
	//	Arrays.asList(a);
	}
		

	}
	
	class Display
	{
		public void show(int... a )
		{
			for(int i : a)
			{
				System.out.println(i);
			}
		}
		
		
	}


