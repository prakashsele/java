package allprograms;

import java.util.Scanner;abstract

public class ScannerClass {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the Value");
		int n = S.nextInt();
		
		try
		{
			System.out.println(10/n);
			System.exit(0); // we cannot use finally block if we use this command
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
		
	
	
	
	


	


