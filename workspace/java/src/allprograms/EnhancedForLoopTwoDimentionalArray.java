package allprograms;

public class EnhancedForLoopTwoDimentionalArray {

	public static void main(String[] args) {
		
		int p[][] = 
			{ 
				{5,6,7},
				{6,7,8},
				{7,8,9}
				
		};
		
		for(int i[] : p)
		{
			for(int j : i)
			{
				System.out.print(j);
			}
			System.out.println("");
		}

	}

}
