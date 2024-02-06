package demo;

public class StarP {

	public static void main(String args[]) {
		// display 
				/*   *****
				      ****
				       ***
				        **
				         *
				       */

/* int num=5;
		for(int i=num;i>=1;i--)             
		{
			for(int j=1;j<=i;j++)            
				System.out.print("*");          
				                           
				System.out.println();
		}
	}*/
		
	// Function to demonstrate pattern
	
		int i, j;

		{	// calculating number of spaces
		int num=5;

		// outer loop to handle rows
		for (i = num; i > 0; i--) {
			// inner loop to print spaces.
			for (j = 0; j < num - i; j++) {
				System.out.print(" ");
			}
			// Decrementing value of num after each loop
			num = num - 2;
			// inner loop to print stars.
			for (j = i; j < 0; j++) {
				System.out.print("*");
			}

			// printing new line for each row
			System.out.println();
		}
		}
	}
}

	
	// Driver Function
	/*public static void main(String args[])
	{
		int n = 6;
		printPattern(n);
	}
}*/

		
		
	



