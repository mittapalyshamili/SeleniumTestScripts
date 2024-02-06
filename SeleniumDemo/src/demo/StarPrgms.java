package demo;

public class StarPrgms {

	public static void main(String[] args) {
		int num=5;
		/*  * * * * *
		    * * * *
		    * * *
		    * *
		    * 
		 */
		for(int i=num;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
				System.out.print("*");
		   System.out.println();
	}
		/*  * * * * *
		      * * * *
		        * * *
		          * *
		            *
		 */  
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
		}
		
		for(int j=i;j<=num;j++) {
			System.out.print("*");
		}
		System.out.println();
		}
				 	/*  *
				 	    * *
				 	    * * *
				 	    * * * *
				 	    * * * * *
				 	 */
				for(int i=1;i<=num;i++)
				{
					for(int j=1;j<=i;j++)
						System.out.print("*");
				   System.out.println();
			}
				/*      *  
			          * *
			        * * *
			      * * * *
			    * * * * *	 
				 */
			
			for(int i=1;i<=num;i++) 
			{
				for(int j=i;j<=num;j++) {
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
	/*
			 *                 *
			 * *             * *
			 * * *         * * *
			 * * * *     * * * *
			 * * * * * * * * * *
			 */
			
			
			for(int i=1;i<=num;i++)
			{
				for(int j=1;j<=i;j++)
				{
				System.out.print("*");
				}
					
			for(int j=i;j<num;j++)
			{
				System.out.print("  ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			}			
			
			// display a pattern
			/* *****
			   ****  
			   ***    
			   **      
			   *
			   *
			   **
			   ****
			   *****
			   ****** */
			
			for(int i=num;i>=1;i--)
			{
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
			   System.out.println();
			}
	
			for(int i=1;i<=num;i++)
			{
				for(int j=1;j<=i;j++) {
					System.out.print("*");
			}
			   System.out.println();
	
			}
			
			// display pattern 
			/* 
			    *****
			     ****
			      ***
			       **
			        *
			        *
			       **
			      ***
			     ****
			    *****
			   		 */
			for(int i=1;i<=num;i++)
			{
				for(int j=1;j<=i;j++) {
					System.out.print(" ");
			}
			
			for(int j=i;j<=num;j++) {
				System.out.print("*");
			}
			System.out.println();
			}
			for(int i=1;i<=num;i++) 
			{
				for(int j=i;j<=num;j++) {
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}

			
	}

}







		
		
		



