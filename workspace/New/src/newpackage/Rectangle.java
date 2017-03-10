package newpackage;

public class Rectangle {
	int length;
	static int count = 0;
	  int breadth;
	  Rectangle(){
		  count+=1;
	  }
	  static{
		  for(int i=0;i<10;i++){
			  System.out.println("Wait time before program loads.......");
		  }
	  }
	  static void printName(){
		  System.out.println("From static method");
	  }

	  void setLength(int len)
	  {
	  length = len;
	  }

	  int getLength(int len)
	  {
	  return length=len;
	  }

	}

	class RectangleDemo {
	  public static void main(String args[]) {

	  Rectangle r1 = new Rectangle();
	  
	  Rectangle r3 = new Rectangle();
	  
	  Rectangle.printName();

	  r1.setLength(20);

	  int len = r1.getLength(10);

	  System.out.println("Length of Rectangle : " + Rectangle.count);

	  }
	}


