package demo;

public class NumFormatPrgm {

	public static void main(String[] args) {
		// display
		/*1
		  12
		  123
		  1234
		  12345 */
		int num=5;
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print(j);
			
			System.out.println();
		}
		// display 
		/* 12345
		   1234
		   123
		   12
		   1 */
		for(int i=num;i>=1;i--)             
		{
			for(int j=1;j<=i;j++)            
				System.out.print(j);          
				                           
				System.out.println();
		}
	
	// display
	/*54321
	  4321
	  321
	  21
	  1*/
	for(int i=num;i>=1;i--)
	{
		for(int j=i;j>=1;j--)
			System.out.print(j);
		
		System.out.println();
	} 
	

}
}