package demo;
// Nested if stmts
/*if(condition)
{}
else
{
if(condition)
	{}
	else
	{}
}*/

public class IfElseIfStmts {

	public static void main(String[] args) {
		int a=30;// check the condition by changing the a and b values accordingly
		int b=30;
		if (a<b)
		{
			System.out.println("a is smaller ");
		}
		else
		{
			if (a>b)
			{
				System.out.println("b is smaller");
			}
			else
			{
				System.out.println(" a and b values are same");
			}
			}
		}
}
		
		
		