package demo;

public class BlockVariables {

	static int b;
	
	public static void main(String[] args)
	{
		int a=10;
		System.out.println(a);
		{
			int d=20;
			System.out.println(d);
		}
		{
			int x=50;
			System.out.println(x);
		}
		}
	}


