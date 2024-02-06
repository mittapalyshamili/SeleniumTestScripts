package demo;
class D
{
	static int y=40;

}
public class StaticVariableWithClassName {
    static int x=20;
	
	public static void main(String[] args) {
		
		System.out.println( D.y);// accessing using classname bcoz the variable is in another class
		System.out.println(x);// accessing directly bcoz variable is in same class .
	}

}
