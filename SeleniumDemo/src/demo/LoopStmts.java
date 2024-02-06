package demo;

public class LoopStmts {

	public static void main(String[] args) 
	{
		// display hello 10 times
		for (int i=1;i<=10;i++)
		{
			System.out.println("hello");
		}
		 
		
		// display 1 to 10 numbers
		 //for(int i=1;i<=10;i++)
		for(int i=1;i<=10;i=i+1)
		{
			System.out.println(i);
		}
		
		// display numbers 10 to 1
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
		// display numbers 2 to 20
		//for (int i=2;i<=20;i=i+1)
			for(int i=2;i<=20;i++)/* this both stmts are used to display 2 to 20 numbers*/
		{
			System.out.println(i);
		}
		
		// display even between 2 to 20
		for(int i=2;i<=20;i=i+2)
		{
			System.out.println(i);
		}
	
		
		// display odd number between 1 to 20
		
		for(int i=1;i<=20;i=i+2)
		{
			System.out.println(i);
		}
		
		
		// display a to z
		for (char i='a';i<='z';i++)
		{
			System.out.println(i);
		}
				
		// display A to Z
		
		for (char i='A';i<='Z';i++)
		{
			System.out.println(i);
		}
		 // display z to a
		
		for (char i='z';i>='a';i--)
		{
			System.out.println(i);
		}
		// display Z to A
		 
		for (char i='Z';i>='A';i--)
		{
			System.out.println(i);
		}
		 // display ASCII values
		 
		for (int i='a';i<='z';i++)
		{
			System.out.println(i);
		}
		for (int i='A';i<='Z';i++)
		{
			System.out.println(i);
		}
		// display mathematics table for given number.
		int num=16;// it displays 16 table
		for(int i=1; i<=10;i++)
			System.out.println(num+"X"+i+"="+(num*i));
		

	
	int num1=12;// it displays 12 table
	{
		
	for(int i=1;i<=10;i++)

		System.out.println(num1+"X"+i+"="+(num1*i));
}
}
	
}

