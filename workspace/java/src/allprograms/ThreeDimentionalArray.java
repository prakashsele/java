package allprograms;

public class ThreeDimentionalArray {

	public static void main(String[] args) {    //1234, 2345, 3456 , a[0], a[1]
		int c[][][] = new int[4][4][4];
		
		for(int i[][] : c)
		{
			for(int j[] : i)
			{
				for(int k : j)
				{
					System.out.print(" " + k);
				}
			}System.out.println("");
			
		}

	}

}
