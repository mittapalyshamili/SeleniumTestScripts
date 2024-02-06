package demo;

public class BlockVarClassLevel {
 
	{ 
		System.out.println(" in instance block");
	}
	static 
	{
		System.out.println("in static block1");
	}
	
	public static void main(String[] args) {

 System.out.println("in method");
 
 BlockVarClassLevel obj=new BlockVarClassLevel();
 System.out.println(" in static block1");
 System.out.println("hello");
	

 }
	}


