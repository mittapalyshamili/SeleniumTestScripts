package demo;
class B1
{
 static int c;
 static long l;
 static byte b;
 static short s;
 }
public class StaticVariableWithDefaultValues {

	static float f;
	static double d;
	static char r;
	static String i;
	
	public static void main(String[] args) {
		System.out.println( B1.c);// By using class name 
		System.out.println(B1.l);// By using class name
		System.out.println(B1.b);// By using class name
		System.out.println(B1.s);// By using class name
		System.out.println(f);// accessing directly 
		System.out.println(d);// accessing directly 
		System.out.println(r);// accessing directly 
		System.out.println(i);// accessing directly 
		
	}

}
