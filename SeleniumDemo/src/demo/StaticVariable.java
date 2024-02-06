package demo;

public class StaticVariable {
	 static int a =10;
  int x=50;
	public static void main(String[] args) {
	 
		// by using ref obj
StaticVariable obj=new StaticVariable();
System.out.println(obj.a);// accessing static variable 
System.out.println(obj.x);// accessing non static variable
		// by using direct obj
System.out.println(new StaticVariable().a );//accessing static variable
System.out.println(new StaticVariable().x);//accessing non static variable
		
System.out.println(StaticVariable.a);// accessing static variable using class name
		
System.out.println(a); // accessing static variable directly.
		
		
	}

}
